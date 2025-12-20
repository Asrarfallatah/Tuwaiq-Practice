package org.example.customer.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiResponse;
import org.example.customer.Model.Merchant;
import org.example.customer.Service.MerchantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/merchant")
@RequiredArgsConstructor
public class MerchantController {

    private final MerchantService merchantService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllCustomers (){

        return ResponseEntity.status(200).body(merchantService.getAllMerchants());

    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addCustomer (@Valid @RequestBody Merchant merchant){

        merchantService.addMerchant(merchant);
        return ResponseEntity.status(200).body(new ApiResponse("merchant information has been added to the database Successfully"));
    }

    // update
    @PutMapping("/update/{merchantId}")
    public ResponseEntity<?> updateCustomer(@PathVariable Integer merchantId, @Valid@RequestBody Merchant merchant){

        merchantService.updateMerchant(merchantId , merchant);
        return ResponseEntity.status(200).body(new ApiResponse("merchant information has been updated to the database Successfully"));
    }


    // delete
    @DeleteMapping("/delete/{merchantId}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Integer merchantId){

        merchantService.deleteMerchant(merchantId);
        return ResponseEntity.status(200).body(new ApiResponse("merchant information has been deleted from the database Successfully"));
    }

    ///  extra endpoints


    //1- count how a specific merchant has many branches
    @GetMapping("/countBranches/{merchantId}")
    public ResponseEntity<?> countBranchesOfMerchant(@PathVariable Integer merchantId){
        Integer count = merchantService.countBranchesOfMerchant(merchantId);
        return ResponseEntity.status(200).body("the merchant with id " + merchantId + " has " + count + " branches ");
    }


    //2- assign customer to merchant
    @PutMapping("/assignCustomer/{merchantId}/{customerId}")
    public ResponseEntity<?> assignCustomerToMerchant(@PathVariable Integer merchantId , @PathVariable Integer customerId){
        merchantService.assignCustomerToMerchant(merchantId , customerId);
        return ResponseEntity.status(200).body(new ApiResponse("customer with id " + customerId + " has been assigned to merchant with id " + merchantId + " Successfully"));

    }

}
