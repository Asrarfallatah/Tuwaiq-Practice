package org.example.customer.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileDTO {

    @NotNull
    private Integer customerId;

    @NotNull
    @Min(value = 1 , message = "age can not be less than 1")
    private Integer age;

    @NotEmpty
    @Email(message = "email should be valid")
    private String email;

    @NotEmpty
    @Size(min = 10 , message = "address should be at least 10 characters")
    private String address;

    @NotEmpty
    @Pattern(regexp = "^[0-9]{10}$" , message = "phone number should be valid with 10 digits")
    private String phoneNumber;


}
