package org.example.test2.Model1;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

   // Student Class : ID , name , age , major  ( all should not be empty)  .

    @NotEmpty(message = "student ID can not be empty ! ")
    private String studentID;

    @NotEmpty(message = "student name can not be empty ! ")
    private String studentName;

    @NotNull(message = "student Age can not be empty !  ")
    private Integer studentAge;

    @NotEmpty(message = "Student Major can not be empty ! ")
    private String studentMajor ;





}
