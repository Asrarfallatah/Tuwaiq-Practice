package org.example.coffeejpa.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.coffeejpa.Api.ApiResponse;
import org.example.coffeejpa.Model.Coffee;
import org.example.coffeejpa.Service.CoffeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/coffee")
public class CoffeeController {


    private final CoffeeService coffeeService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getCoffee(){

        return ResponseEntity.status(200).body(coffeeService.getAllCoffees());
    }


    // add
    @PostMapping("/add")
    public ResponseEntity<?> addCoffee(@Valid @RequestBody Coffee coffee){

        coffeeService.addCoffee(coffee);
        return ResponseEntity.status(200).body(new ApiResponse("Item has been added to the DataBase Successfully ! "));

    }



    // update
    @PutMapping("/update/{coffeeId}")
    public ResponseEntity<?> updateCoffee(@PathVariable Integer coffeeId, @Valid @RequestBody Coffee coffee){

        coffeeService.updateCoffee (coffeeId,coffee);

        return ResponseEntity.status(200).body(new ApiResponse("Item has been updated in the DataBase Successfully ! "));
    }


    //delete
    @DeleteMapping("/delete/{coffeeId}")
    public ResponseEntity<?> deleteCoffee(@Valid@PathVariable Integer coffeeId){

        coffeeService.deleteCoffee(coffeeId);

        return ResponseEntity.status(200).body(new ApiResponse("Item has been deleted to the DataBase Successfully ! "));

    }


    // extra end point

//    @GetMapping("/get-by-id/{coffeeId}")
//    public ResponseEntity<?> getCoffeeByCoffeeID(@PathVariable Integer coffeeId){
//
//        Coffee isFound =  coffeeService.getCoffeeByCoffeeID(coffeeId);
//
//        if (isFound == null){
//            return ResponseEntity.status(400).body(new ApiResponse("there is no Coffee with that id within the DataBase yet ! "));
//        }
//
//        return ResponseEntity.status(200).body(isFound);
//    }
//
//
//
//    @GetMapping("/get-by-category/{coffeeCategory}")
//    public ResponseEntity<?> getCoffeeByCoffeeCategory(@PathVariable String coffeeCategory){
//
//        List<Coffee> isFound =  coffeeService.getCoffeeByCoffeeCategory(coffeeCategory);
//
//        if (isFound == null){
//            return ResponseEntity.status(400).body(new ApiResponse("there is no Coffee Category with that name within the DataBase yet ! "));
//        }
//
//        return ResponseEntity.status(200).body(isFound);
//
//    }
//
//    @GetMapping("/get-by-category-name/{coffeeCategory}/ {coffeeName}")
//    public ResponseEntity<?> getCoffeeByCoffeeCategoryAndCoffeeName(@PathVariable String coffeeCategory , @PathVariable String coffeeName){
//
//        List<Coffee> isFound =  coffeeService.getCoffeeByCoffeeCategoryAndCoffeeName(coffeeCategory , coffeeName);
//
//        if (isFound == null){
//            return ResponseEntity.status(400).body(new ApiResponse("there is no Coffee Category with that name within the DataBase yet ! "));
//        }
//
//        return ResponseEntity.status(200).body(isFound);
//
//    }
//
//
//    //find employee coffee
//    @GetMapping("/get-by-employee-id/{coffeeId}")
//    public ResponseEntity<?> getCoffeeByEmployeeID(@PathVariable Integer coffeeId){
//
//        List<Coffee> isFound =  coffeeService.getCoffeeByEmployeeID(coffeeId);
//
//        if (isFound == null){
//            return ResponseEntity.status(400).body(new ApiResponse("there is no Coffee with that id within the DataBase yet ! "));
//        }
//
//        return ResponseEntity.status(200).body(isFound);
//    }
//
//
//    @GetMapping("/get-earn")
//    public ResponseEntity<?> getDailyEarn(){
//
//
//        List<Coffee> isSort =  coffeeService.getDailyEarnings();
//
//        if (isSort == null){
//            return ResponseEntity.status(400).body(new ApiResponse("no earn yet ! "));
//        }
//
//        return ResponseEntity.status(200).body(isSort);
//    }
//
//
//    @GetMapping("/get-gain")
//    public ResponseEntity<?> getGain(){
//
//
//        double isSort =  coffeeService.getTotalCoffeeGain();
//
//        if (isSort == 0.0){
//            return ResponseEntity.status(400).body(new ApiResponse("no gain yet! "));
//        }
//
//        return ResponseEntity.status(200).body(isSort);
//    }
//
//



}
