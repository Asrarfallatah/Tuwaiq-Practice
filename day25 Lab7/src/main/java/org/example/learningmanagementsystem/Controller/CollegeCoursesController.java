package org.example.learningmanagementsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.learningmanagementsystem.ApiResponse.ApiResponse;
import org.example.learningmanagementsystem.Model.CollegeCourses;
import org.example.learningmanagementsystem.Service.CollegeCoursesService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/CollegeCourses")
public class CollegeCoursesController {

    private final CollegeCoursesService collegeCoursesService;

    // get all
    @GetMapping("/get")
    public ResponseEntity<?> getCourses() {

        if (collegeCoursesService.getAllCourses().isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("there is no courses to display !"));
        }

        return ResponseEntity.status(200).body(collegeCoursesService.getAllCourses());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addCourse(@Valid @RequestBody CollegeCourses course, Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        collegeCoursesService.addCourse(course);
        return ResponseEntity.status(200).body(new ApiResponse("course has been added successfully"));
    }

    // update
    @PutMapping("/update/{courseID}")
    public ResponseEntity<?> updateCourse(@PathVariable String courseID, @Valid @RequestBody CollegeCourses course, Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        boolean isUpdated = collegeCoursesService.updateCourse(courseID, course);

        if (isUpdated) {
            return ResponseEntity.status(200).body(new ApiResponse("course has been updated successfully"));
        }

        return ResponseEntity.status(400).body(new ApiResponse("error no course with that ID"));
    }

    // delete
    @DeleteMapping("/delete/{courseID}")
    public ResponseEntity<?> deleteCourse(@PathVariable String courseID) {

        boolean isDeleted = collegeCoursesService.deleteCourse(courseID);

        if (isDeleted) {
            return ResponseEntity.status(200).body(new ApiResponse("course has been deleted successfully"));
        }

        return ResponseEntity.status(400).body(new ApiResponse("error no course with that ID"));
    }

    // get by ID
    @GetMapping("/get-id/{courseID}")
    public ResponseEntity<?> getByID(@PathVariable String courseID) {

        CollegeCourses course = collegeCoursesService.getByID(courseID);
        if (course == null) {
            return ResponseEntity.status(400).body(new ApiResponse("no course found with that ID"));
        }

        return ResponseEntity.status(200).body(course);
    }

    // get by credit hour
    @GetMapping("/get-credit/{courseCreditHour}")
    public ResponseEntity<?> getByCredit(@PathVariable int courseCreditHour) {

        var found = collegeCoursesService.getByCredit(courseCreditHour);
        if (found.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("no courses with that credit hour"));
        }

        return ResponseEntity.status(200).body(found);
    }

    // update weekly hour
    @PutMapping("/update-weekly/{courseID}")
    public ResponseEntity<?> updateWeekly(@PathVariable String courseID) {

        boolean updated = collegeCoursesService.updateWeeklyHouByLab(courseID);

        if (updated) {
            return ResponseEntity.status(200).body(new ApiResponse("weekly hour updated successfully"));

        }

        return ResponseEntity.status(400).body(new ApiResponse("no course found with that ID"));
    }
}
