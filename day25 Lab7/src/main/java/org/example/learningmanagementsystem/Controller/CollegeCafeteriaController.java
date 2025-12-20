package org.example.learningmanagementsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.learningmanagementsystem.ApiResponse.ApiResponse;
import org.example.learningmanagementsystem.Model.CollegeCafeteria;
import org.example.learningmanagementsystem.Service.CollegeCafeteriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/collegecafeteria")
public class CollegeCafeteriaController {

    private final CollegeCafeteriaService collegeCafeteriaServices;


    // get
    @GetMapping("/get")
    public ResponseEntity<?> getStudents(){

        if (collegeCafeteriaServices.displayOrders().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse(" there is no Student information yet to display "));
        }

        return ResponseEntity.status(200).body(collegeCafeteriaServices.displayOrders());

    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addOrder(@Valid @RequestBody CollegeCafeteria collegeCafeteriaService, Errors errors){

        if (errors.hasErrors()){
            String massage = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage));
        }

        collegeCafeteriaServices.addOrder(collegeCafeteriaService);
        return ResponseEntity.status(200).body(new ApiResponse("order information's has benn added successfully  "));

    }

    //update
    @PutMapping("/update/{cafeteriaFoodOrderedID}")
    public ResponseEntity<?> updateOrder(@PathVariable String cafeteriaFoodOrderedID, @Valid @RequestBody CollegeCafeteria collegeCafeteriaService, Errors errors){

        if (errors.hasErrors()){
            String massage = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage));
        }

        boolean isUpdated = collegeCafeteriaServices.updateOrder(cafeteriaFoodOrderedID,collegeCafeteriaService);
        if(isUpdated){
            return ResponseEntity.status(200).body(new ApiResponse("order information's has benn updated successfully  "));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no order with that information to update its information "));

    }


    //delete
    @DeleteMapping("/delete/{cafeteriaFoodOrderedID}")
    public ResponseEntity<?> deleteOrder(@Valid @PathVariable String cafeteriaFoodOrderedID){

        boolean isDeleted = collegeCafeteriaServices.deleteOrder(cafeteriaFoodOrderedID);
        if (isDeleted) {
            return ResponseEntity.status(200).body(new ApiResponse(" order information has been  deleted successfully !"));
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no order with that information  !"));

    }

    // get by tpe
    @GetMapping("/get-type/{cafeteriaFoodType}")
    public ResponseEntity<?> getByType(@PathVariable String cafeteriaFoodType) {

        var foundOrders = collegeCafeteriaServices.getByType(cafeteriaFoodType);

        if (foundOrders.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("Error no orders with that food type !"));
        }

        return ResponseEntity.status(200).body(foundOrders);
    }


    // get by range
    @GetMapping("/get-price/{min}/{max}")
    public ResponseEntity<?> getByPrice(@PathVariable double cafeteriaFoodPriceMin, @PathVariable double cafeteriaFoodPriceMax) {

        var foundOrders = collegeCafeteriaServices.getByPrice(cafeteriaFoodPriceMin, cafeteriaFoodPriceMax);

        if (foundOrders.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("Error no orders in that price range !"));
        }

        return ResponseEntity.status(200).body(foundOrders);
    }







}
