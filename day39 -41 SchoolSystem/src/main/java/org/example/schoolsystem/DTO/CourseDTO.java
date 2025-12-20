package org.example.schoolsystem.DTO;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDTO {


    @NotEmpty(message = "courseName can not be empty")
    @Pattern(regexp = "^[a-zA-Z\\s]+$" , message = "courseName should contain only letters and spaces")
    private String courseName;



}
