package org.example.schoolsystem.Controller;


import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiResponse;
import org.example.schoolsystem.Model.Student;
import org.example.schoolsystem.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {


    // connect to database
    private final StudentService studentService;


    // get all students
    @GetMapping("/get")
    public ResponseEntity<?> getAllStudents(){
        return ResponseEntity.status(200).body(studentService.getAllStudents());
    }


    // add a student
    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.status(200).body(new ApiResponse("student has been added successfully to the database !"));
    }

    // update a student
    @PutMapping("/update/{studentId}")
    public ResponseEntity<?> updateStudent(@PathVariable Integer studentId , @RequestBody Student student){
        studentService.updateStudent(studentId , student);
        return ResponseEntity.status(200).body( new ApiResponse("student has been updated successfully in the database !"));
    }


    // delete a student
    @DeleteMapping("/delete/{studentId}")
    public ResponseEntity<?> deleteStudent(@PathVariable Integer studentId){
        studentService.deleteStudent(studentId);
        return ResponseEntity.status(200).body(new ApiResponse("student has been deleted successfully from the database !"));
    }


    ///  extra endpoint

    // change student major
    @PutMapping("/change-major/{studentId}/{major}")
    public ResponseEntity<?> changeMajor(@PathVariable Integer studentId,@PathVariable String major){
        studentService.updateStudentMajor(studentId, major);
        return ResponseEntity.status(200).body(new ApiResponse("student major changed successfully !"));
    }








}
