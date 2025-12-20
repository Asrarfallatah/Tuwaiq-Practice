package org.example.lab5.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private int studentID ;
    private String studentName ;
    private int studentAge;
    private String studentDegree ;
    private double studentGPA ;

}
