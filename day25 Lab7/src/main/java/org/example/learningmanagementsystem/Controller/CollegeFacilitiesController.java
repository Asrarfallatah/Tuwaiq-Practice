package org.example.learningmanagementsystem.Controller;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.learningmanagementsystem.ApiResponse.ApiResponse;
import org.example.learningmanagementsystem.Model.CollegeFacilities;
import org.example.learningmanagementsystem.Service.CollegeFacilitiesService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/collegefacilities")
@AllArgsConstructor
public class CollegeFacilitiesController {

    private final CollegeFacilitiesService facilitiesService;

    // get all
    @GetMapping("/get")
    public ResponseEntity<?> getAllFacilities() {

        if (facilitiesService.getAllFacilities().isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("there is no facilities to display !"));
        }

        return ResponseEntity.status(200).body(facilitiesService.getAllFacilities());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addFacility(@Valid @RequestBody CollegeFacilities facility, Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        facilitiesService.addFacility(facility);
        return ResponseEntity.status(200).body(new ApiResponse("facility has been added successfully"));
    }

    // update
    @PutMapping("/update/{roomNumber}")
    public ResponseEntity<?> updateFacility(@PathVariable int roomNumber, @Valid @RequestBody CollegeFacilities facility, Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        boolean isUpdated = facilitiesService.updateFacility(roomNumber, facility);

        if (isUpdated) {
            return ResponseEntity.status(200).body(new ApiResponse("facility has been updated successfully"));
        }

        return ResponseEntity.status(400).body(new ApiResponse("error no facility with that room number"));
    }

    // delete
    @DeleteMapping("/delete/{roomNumber}")
    public ResponseEntity<?> deleteFacility(@PathVariable int roomNumber) {

        boolean isDeleted = facilitiesService.deleteFacility(roomNumber);

        if (isDeleted) {
            return ResponseEntity.status(200).body(new ApiResponse("facility has been deleted successfully"));
        }

        return ResponseEntity.status(400).body(new ApiResponse("error no facility with that room number"));
    }

    // get by floor
    @GetMapping("/get-floor/{floor}")
    public ResponseEntity<?> getByFloor(@PathVariable String floor) {

        var found = facilitiesService.getByFloor(floor);

        if (found.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("no facilities on that floor"));
        }

        return ResponseEntity.status(200).body(found);
    }

    // get by open time
    @GetMapping("/get-open/{openTime}")
    public ResponseEntity<?> getByOpenTime(@PathVariable String openTime) {

        var found = facilitiesService.getByOpenTime(openTime);

        if (found.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("no facilities open at that time"));
        }

        return ResponseEntity.status(200).body(found);
    }

    // check third floor
    @PutMapping("/check-third-floor/{roomNumber}")
    public ResponseEntity<?> checkThirdFloor(@PathVariable int roomNumber) {

        boolean updated = facilitiesService.updateSafetyStairs(roomNumber);

        if (updated) {
            return ResponseEntity.status(200).body(new ApiResponse("safety stairs updated successfully"));
        }

        return ResponseEntity.status(400).body(new ApiResponse("no facility with that room number"));
    }

}
