package org.example.jobseek.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.jobseek.ApiResponse.ApiResponse;
import org.example.jobseek.Model.JobApplication;
import org.example.jobseek.Service.JobApplicationService;
import org.example.jobseek.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/job-application")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;
    private final UserService userService;

    // get all users
    @GetMapping("/get")
    public ResponseEntity<?> getJobApplication(){

        if (jobApplicationService.getAllJobApplication().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no job Application in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(jobApplicationService.getAllJobApplication());
    }

    // add
    @PostMapping("/add/{userID}")
    public ResponseEntity<?> addJobApplication(@PathVariable Integer userID, @Valid @RequestBody JobApplication jobApplication , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        if(!userService.getUserRole(userID).equalsIgnoreCase("Job_Seeker")){
            return ResponseEntity.status(400).body(new ApiResponse(" Error Only Job Seekers can apply for jobs ! "));
        }

        jobApplicationService.addJobApplication(jobApplication);
        return ResponseEntity.status(200).body(new ApiResponse("job Application information has been added to the DataBase Successfully ! "));
    }

    // update
    @PutMapping("/update/{jobApplicationID}")
    public ResponseEntity<?> updateJobApplication(@PathVariable Integer jobApplicationID , @Valid @RequestBody JobApplication jobApplication, Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = jobApplicationService.updateJobApplication(jobApplicationID, jobApplication);
        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no job Application with that ID in the DataBase  is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("job Application information has been updated Successfully ! "));
    }

    // delete
    @DeleteMapping("/delete/{jobApplicationID}")
    public ResponseEntity<?> deleteJobApplication(@PathVariable Integer jobApplicationID){

        boolean isDeleted = jobApplicationService.deleteJobApplication(jobApplicationID);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no job Application with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("job Application information has been deleted Successfully ! "));
    }

    // get all applications for specific user
   @GetMapping("/user/{userID}")
   public ResponseEntity<?> getUserApplications(@PathVariable Integer userID){
            return ResponseEntity.status(200).body(jobApplicationService.getApplicationsForUser(userID));
   }



}
