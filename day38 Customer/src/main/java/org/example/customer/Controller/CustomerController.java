package org.example.customer.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.customer.Api.ApiResponse;
import org.example.customer.Model.Customer;
import org.example.customer.Service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    // connect to the database
    private final CustomerService customerService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllCustomers (){

        return ResponseEntity.status(200).body(customerService.getAllCustomers());

    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addCustomer (@Valid @RequestBody Customer customer){

        customerService.addCustomer(customer);
        return ResponseEntity.status(200).body(new ApiResponse("Customer information has been added to the database Successfully"));
    }

    // update
    @PutMapping("/update/{customerId}")
    public ResponseEntity<?> updateCustomer(@PathVariable Integer customerId, @Valid@RequestBody Customer customer){

        customerService.updateCustomer(customerId , customer);
        return ResponseEntity.status(200).body(new ApiResponse("Customer information has been updated to the database Successfully"));
    }


    // delete
    @DeleteMapping("/delete/{customerId}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Integer customerId){

        customerService.deleteCustomer(customerId);
        return ResponseEntity.status(200).body(new ApiResponse("Customer information has been deleted from the database Successfully"));
    }



}
