package org.example.schoolsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiResponse;
import org.example.schoolsystem.DTO.AddressDTO;
import org.example.schoolsystem.Service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;



    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllAddresses(){
        return ResponseEntity.status(200).body(addressService.getAllAddresses());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> address(@Valid @RequestBody AddressDTO addressDTO){

        addressService.addAddress(addressDTO);
        return ResponseEntity.status(200).body(new ApiResponse("address has been added successfully to the database!"));
    }

    // update
    @PutMapping("/update")
    public ResponseEntity<?> updateAddress( @Valid @RequestBody AddressDTO addressDTO){

        addressService.updateAddress(addressDTO);
        return ResponseEntity.status(200).body(new ApiResponse("address has been updated successfully to the database !"));
    }


    // delete
    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<?> deleteAddress(@PathVariable Integer addressId){
        addressService.deleteAddress(addressId);
        return ResponseEntity.status(200).body(new ApiResponse("address has been deleted successfully from the database !"));
    }

}
