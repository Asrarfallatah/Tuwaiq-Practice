package org.example.test2.Controller1;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.test2.ApiResponse.ApiResponse;
import org.example.test2.Model1.Student;
import org.example.test2.Service1.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {


//    instructions :

    // create a variable from service :
    private final StudentService studentService ;


//    Get all students
    @GetMapping("/get")
    public ResponseEntity<?> getStudents(){

        if (studentService.displayStudents().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse(" there is no Student information yet to display "));
        }

        return ResponseEntity.status(200).body(studentService.displayStudents());

    }



//    Add new student
    @PostMapping("/add")
    public ResponseEntity<?> addStudents(@Valid @RequestBody Student student, Errors errors){

        if (errors.hasErrors()){
            String massage = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage));
        }

        studentService.addStudent(student);
        return ResponseEntity.status(200).body(new ApiResponse("student information's has benn added successfully  "));

    }



//    update student
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudents(@Valid @PathVariable String id ,@RequestBody Student student){

        boolean isUpdated = studentService.updateStudent(id, student);
        if(isUpdated){
            return ResponseEntity.status(200).body(new ApiResponse("student information's has benn updated successfully  "));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no student with that information to update his information "));

    }



//    delete student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudents(@Valid @PathVariable String id){

        boolean isDeleted = studentService.deleteStudent(id);
        if(isDeleted){
            return ResponseEntity.status(200).body(new ApiResponse("student information's has benn deleted successfully  "));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no student with that information to delete his information "));

    }



//    Create an endpoint that takes a major and returns all students who have this major.
    @GetMapping("/get-major/{major}")
    public ResponseEntity<?> getByMajor(@PathVariable String major){

        if( !(studentService.getByMajor(major).isEmpty())  ) {
            return ResponseEntity.status(200).body(studentService.getByMajor(major));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no student with that major to print their information "));

    }


//    Create an endpoint that takes a student name and returns one student .
    @GetMapping("/get-name/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name){

        if( !(studentService.getByName(name).isEmpty())  ) {
            return ResponseEntity.status(200).body(studentService.getByName(name));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no student with that major to print their information "));

    }

}
