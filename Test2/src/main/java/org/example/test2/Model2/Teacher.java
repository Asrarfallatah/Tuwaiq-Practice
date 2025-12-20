package org.example.test2.Model2;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {

    // Teacher Class : ID , name , salary ( all should not be empty).

    @NotEmpty(message = "teacher ID can not be empty ! ")
    private String teacherID;

    @NotEmpty(message = "teacher name can not be empty ! ")
    private String teacherName;

    @NotNull(message = "teacher salary can not be empty !  ")
    private Double teacherSalary;


}
