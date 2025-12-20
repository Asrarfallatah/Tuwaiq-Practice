package org.example.schoolsystem.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDTO {

    @NotNull(message = "teacherId can not be null")
    private Integer teacherId;

    @NotEmpty(message = "area can not be empty")
    @Size(min = 3 , message = "area should be at least 3 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$" , message = "area should contain only letters and spaces")
    private String area;

    @NotEmpty(message = "street can not be empty")
    @Size(min = 3 , message = "street should be at least 3 characters")
    @Pattern(regexp = "^[a-zA-Z\\s]+$" , message = "area should contain only letters and spaces")
    private String street;

    @NotNull(message = "buildingNumber can not be null")
    private Integer buildingNumber;
}
