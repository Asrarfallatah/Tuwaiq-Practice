package org.example.test2.Controller2;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.test2.ApiResponse.ApiResponse;
import org.example.test2.Model2.Teacher;
import org.example.test2.Service2.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/teacher")
@RequiredArgsConstructor
public class TeacherController {

    //    instructions :

    // create a variable from service :
    private final TeacherService teacherService ;


    //    Get all teachers
    @GetMapping("/get")
    public ResponseEntity<?> getTeacher(){

        if (teacherService.displayTeacher().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse(" there is no teachers information yet to display "));
        }

        return ResponseEntity.status(200).body(teacherService.displayTeacher());

    }



    //    Add new teacher
    @PostMapping("/add")
    public ResponseEntity<?> addTeacher(@Valid @RequestBody Teacher teacher, Errors errors){

        if (errors.hasErrors()){
            String massage = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(massage));
        }

        teacherService.addTeacher(teacher);
        return ResponseEntity.status(200).body(new ApiResponse("teacher information's has benn added successfully  "));

    }



    //    update teacher
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateTeacher(@Valid @PathVariable String id ,@RequestBody Teacher teacher){

        boolean isUpdated = teacherService.updateTeacher(id, teacher);
        if(isUpdated){
            return ResponseEntity.status(200).body(new ApiResponse("teacher information's has benn updated successfully  "));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no teacher with that information to update his information "));

    }


    //    delete teacher
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTeacher(@Valid @PathVariable String id){

        boolean isDeleted = teacherService.deleteTeacher(id);
        if(isDeleted){
            return ResponseEntity.status(200).body(new ApiResponse("teacher information's has benn deleted successfully  "));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no teacher with that information to delete his information "));

    }


    //    Create an endpoint that takes a teacher id and returns one teacher .
    @GetMapping("/get-name/{id}")
    public ResponseEntity<?> getByName(@PathVariable String id){

        if( !(teacherService.getByID(id).isEmpty())  ) {
            return ResponseEntity.status(200).body(teacherService.getByID(id));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no teacher with that id to print its information "));

    }

    //    Create an endpoint that takes a salary and return all teachers who have this salary or above .
    @GetMapping("/get-salary/{salary}")
    public ResponseEntity<?> getBySalary(@PathVariable double salary){

        if( !(teacherService.getBySalary(salary).isEmpty())  ) {
            return ResponseEntity.status(200).body(teacherService.getBySalary(salary));
        }
        return ResponseEntity.status(400).body(new ApiResponse("error no teacher with that id to print its information "));

    }


}
