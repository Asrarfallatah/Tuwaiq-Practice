package org.example.schoolsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiResponse;
import org.example.schoolsystem.Model.Teacher;
import org.example.schoolsystem.Service.CourseService;
import org.example.schoolsystem.Service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/teacher")
@RequiredArgsConstructor
public class TeacherController {


    private final TeacherService teacherService;

    private final CourseService courseService;


    //get
    @GetMapping("/get")
    public ResponseEntity<?> getAllTeachers(){
        return ResponseEntity.status(200).body(teacherService.getAllTeachers());
    }

    //add
    @PostMapping("/add")
    public ResponseEntity<?> addTeacher(@Valid @RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
        return ResponseEntity.status(200).body(new ApiResponse("teacher information has been added Successfully to the database !"));
    }

    //update
    @PutMapping("/update/{teacherId}")
    public ResponseEntity<?> updateTeacher(@PathVariable Integer teacherId,@Valid @RequestBody Teacher teacher){
        teacherService.updateTeacher(teacherId, teacher);
        return ResponseEntity.status(200).body(new ApiResponse("teacher information has been updated Successfully to the database !"));
    }


    //delete
    @DeleteMapping("/delete/{teacherId}")
    public ResponseEntity<?> deleteTeacher(@PathVariable Integer teacherId){
        teacherService.deleteTeacher(teacherId);
        return ResponseEntity.status(200).body(new ApiResponse("teacher information has been deleted Successfully from the database !"));
    }


    // get teacher details by id
    @GetMapping("/details/{teacherId}")
    public ResponseEntity<?> getTeacherDetails(@PathVariable Integer teacherId){

        teacherService.getTeacherDetails(teacherId);
        return ResponseEntity.status(200).body(teacherService.getTeacherDetails(teacherId));
    }


    // assign student to teacher
    @PutMapping ("/assign-student-to-teacher/{teacherId}/{studentId}")
    public ResponseEntity<?> assignStudentToTeacher(@PathVariable Integer teacherId ,@PathVariable Integer studentId){
        teacherService.assignStudentToTeacher(teacherId, studentId);
        return ResponseEntity.status(200).body(new ApiResponse("student has been assigned to the teacher successfully !"));
    }


}
