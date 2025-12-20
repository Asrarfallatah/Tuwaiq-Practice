package org.example.customer.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiResponse;
import org.example.customer.DTO.ProfileDTO;
import org.example.customer.Service.ProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;


    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllProfiles(){

        return ResponseEntity.status(200).body(profileService.getAllProfile());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addProfile(@Valid @RequestBody ProfileDTO profileDTO){

        profileService.addProfile(profileDTO);
        return ResponseEntity.status(200).body(new ApiResponse("Profile information has been added to the database Successfully"));
    }

    // update
    @PutMapping("/update")
    public ResponseEntity<?> updateProfile(@Valid @RequestBody ProfileDTO profileDTO){

        profileService.updateProfile(profileDTO);
        return ResponseEntity.status(200).body(new ApiResponse("Profile information has been updated to the database Successfully"));
    }

    // delete
    @DeleteMapping("/delete/{profileId}")
    public ResponseEntity<?> deleteProfile(@PathVariable Integer profileId){

        profileService.deleteProfile(profileId);
        return ResponseEntity.status(200).body(new ApiResponse("Profile information has been deleted from the database Successfully"));
    }



}
