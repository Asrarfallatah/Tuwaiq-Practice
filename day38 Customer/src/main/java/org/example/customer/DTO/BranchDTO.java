package org.example.customer.DTO;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BranchDTO {

    @NotEmpty(message = "number can not be empty")
    private String area;

    @Min(value = 0 , message = "count can not be negative")
    private Integer count;

}
