package org.example.lab5.Controller;

import org.example.lab5.ApiResponse.ApiResponse;
import org.example.lab5.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {


    ArrayList <Student> students = new ArrayList<>();

    // display get
    @GetMapping("/get")
    public ArrayList<Student> displayStudent(){
        return students;
    }

    //add put
    @PostMapping("/add")
    public ApiResponse addStudent(@RequestBody Student student){
        students.add(student);
        return new ApiResponse( "student information has been added successfully ");
    }

    //update post
    @PutMapping("/update/{index}")
    public ApiResponse updateStudent(@RequestBody Student student , @PathVariable int index ){
        students.set(index, student);
        return new ApiResponse("student information has been updated successfully");
    }

    // delete delete
    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteStudent(@PathVariable int index){
        students.remove(index);
        return new ApiResponse("student information has been deleted successfully");
    }

    // honor student
    @GetMapping("/getHonor")
    public ArrayList<String> getHonorStudent(){

        ArrayList<String> honorStudents = new ArrayList<>();

        for (Student student : students){

            if(student.getStudentGPA() >= 3.75 && student.getStudentGPA() <= 4 ){
                honorStudents.add("student" + student.getStudentName()  + " with GPA =  "+ student.getStudentGPA() + " is a First honor student");
            }
            else if (student.getStudentGPA() >= 3.25 && student.getStudentGPA() < 3.75) {
                honorStudents.add("student" + student.getStudentName()  + " with GPA =  "+ student.getStudentGPA() + " is a Second honor student");
            }
        }

        return honorStudents ;
    }

    // greater than average
    @GetMapping("/get/average")
    public ArrayList<Student> getBestGpa(){

        double totalStudent  = students.size();
        double totalStudentGpa = 0.00;
        double average;
        ArrayList<Student> bestStudents = new ArrayList<>();

        for (Student student : students){
            totalStudentGpa += student.getStudentGPA();
        }

        average = totalStudentGpa / totalStudent ;

        for (Student student : students) {
            if ( student.getStudentGPA() > average ) {
                bestStudents.add(student);
            }
        }

        return bestStudents;
    }

}
