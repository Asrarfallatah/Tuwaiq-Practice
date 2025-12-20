package org.example.schoolsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.schoolsystem.Api.ApiResponse;
import org.example.schoolsystem.DTO.CourseDTO;
import org.example.schoolsystem.Model.Course;
import org.example.schoolsystem.Model.Teacher;
import org.example.schoolsystem.Service.CourseService;
import org.example.schoolsystem.Service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/course")
@RequiredArgsConstructor
public class CourseController {


    private final CourseService courseService;
    private final TeacherService teacherService;


    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllCourses(){
        return ResponseEntity.status(200).body(courseService.getAllCourses());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@Valid @RequestBody Course course){

        courseService.addCourse(course);
        return ResponseEntity.status(200).body(new ApiResponse("course has been added successfully to the database !"));
    }


    // update
    @PutMapping("/update/{courseId}")
    private ResponseEntity<?> updateCourse(@PathVariable Integer courseId ,@Valid @RequestBody CourseDTO courseDTO){
        courseService.updateCourse( courseId , courseDTO);
        return ResponseEntity.status(200).body(new ApiResponse("course has been updated successfully to the database !"));
    }

    @PutMapping("/assign-course-to-teacher/{teacher_id}/{course_id}")
    public ResponseEntity<?> assignCourseToTeacher(@PathVariable Integer teacher_id, @PathVariable Integer course_id){
        courseService.assignCourseToTeacher( teacher_id, course_id);
        return ResponseEntity.status(200).body(new ApiResponse("course has been assigned to the teacher successfully !"));
    }

    // delete
    @DeleteMapping("/delete/{courseId}")
    private ResponseEntity<?> deleteCourse(@PathVariable Integer courseId){
        courseService.deleteCourse(courseId);
        return ResponseEntity.status(200).body(new ApiResponse("course has been deleted successfully from the database !"));
    }

    /// Extra endpoint

    // getTeacherNameByCourseId

    @GetMapping("/teacher-name/{courseId}")
    public ResponseEntity<?> getTeacherNameByCourseId(@PathVariable Integer courseId) {
        Teacher teacher = courseService.getTeacherNameByCourseId(courseId);
        return ResponseEntity.status(200).body(teacher);
    }


    // getCourseDetailsById
    // get students in this course
    @GetMapping("/students/{courseId}")
    public ResponseEntity<?> getStudentsByCourseId(@PathVariable Integer courseId){
        return ResponseEntity.status(200).body(courseService.getStudentsByCourseId(courseId));
    }



}
