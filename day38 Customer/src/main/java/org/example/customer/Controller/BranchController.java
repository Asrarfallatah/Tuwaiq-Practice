package org.example.customer.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiResponse;
import org.example.customer.Model.Branch;
import org.example.customer.Service.BranchService;
import org.example.customer.Service.MerchantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/branch")
@RequiredArgsConstructor
public class BranchController {

    private final BranchService branchService;
    private final MerchantService merchantService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllBranches(){

        return ResponseEntity.status(200).body(branchService.getAllBranch());
    }


    // add
    @PostMapping("/add/{merchant_id}")
    public ResponseEntity<?> addBranch(@PathVariable Integer merchant_id ,@Valid@RequestBody Branch branch){

        branchService.addBranch(merchant_id, branch);
        return ResponseEntity.status(200).body(new ApiResponse("branch has been added successfully to the database ! "));
    }


    // update
    @PostMapping("/update/{branchId}")
    public ResponseEntity<?> updateBranch(@PathVariable Integer branchId ,@Valid@RequestBody Branch branch){

        branchService.updateBranch(branchId , branch);
        return ResponseEntity.status(200).body(new ApiResponse("branch has been added successfully to the database ! "));
    }

    // delete
    @DeleteMapping("/delete/{branchId}")
    public ResponseEntity<?> deleteBranch(@PathVariable Integer branchId){

        branchService.deleteBranch(branchId);
        return ResponseEntity.status(200).body(new ApiResponse("branch has been added successfully to the database ! "));
    }


    ///  extra endpoint

    // see a selected info about all branches (only area)
   @GetMapping("/areas")
    public ResponseEntity<?> getBranchAreaInfo(){
        return ResponseEntity.status(200).body(branchService.getBranches());
    }

    //  2- get all branches in a specific city
    @GetMapping("/by-city/{city}")
    public ResponseEntity<?> getBranchesInCity(@PathVariable String city){
        return ResponseEntity.status(200).body(branchService.getBranchesInCity(city));
    }

    // 3 - using branchDTO see for each area how many branches are there
    @GetMapping("/count-by-area")
    public ResponseEntity<?> getBranchCountByArea() {
        return ResponseEntity.status(200).body(branchService.getBranchCountByArea());
    }



}
