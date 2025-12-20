package org.example.jobseek.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.jobseek.ApiResponse.ApiResponse;
import org.example.jobseek.Model.JobPost;
import org.example.jobseek.Service.JobPostService;
import org.example.jobseek.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/job-post")
public class JobPostController {


    public final JobPostService jobPostService;
    private final UserService userService;

    // get all users
    @GetMapping("/get")
    public ResponseEntity<?> getJobPost(){

        if (jobPostService.getAllJobPost().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no job post in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(jobPostService.getAllJobPost());
    }

    // add
    @PostMapping("/add/{employerID}")
    public ResponseEntity<?> addJobPost(@PathVariable Integer employerID, @Valid @RequestBody JobPost jobPost , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        if(!userService.getUserRole(employerID).equalsIgnoreCase("Employer")){
            return ResponseEntity.status(400).body(new ApiResponse(" Error Only Employees can create job posts ! "));
        }

        jobPostService.addJobPost(jobPost);
        return ResponseEntity.status(200).body(new ApiResponse("job post information has been added to the DataBase Successfully ! "));
    }

    // update
    @PutMapping("/update/{jobPostID}")
    public ResponseEntity<?> updateJobPost(@PathVariable Integer jobPostID , @Valid @RequestBody JobPost jobPost, Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = jobPostService.updateJobPost(jobPostID, jobPost);
        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no job post with that ID in the DataBase  is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("job post information has been updated Successfully ! "));
    }

    // delete
    @DeleteMapping("/delete/{jobPostID}")
    public ResponseEntity<?> deleteJobPost(@PathVariable Integer jobPostID){

        boolean isDeleted = jobPostService.deleteJobPost(jobPostID);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no job post with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("job post information has been deleted Successfully ! "));
    }


    // search job by title
    @GetMapping("/search/title/{title}")
    public ResponseEntity<?> searchByTitle(@PathVariable String title){
        return ResponseEntity.status(200).body(jobPostService.searchByTitle(title));
    }

}
