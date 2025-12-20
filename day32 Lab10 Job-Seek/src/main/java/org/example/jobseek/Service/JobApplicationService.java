package org.example.jobseek.Service;

import lombok.RequiredArgsConstructor;
import org.example.jobseek.Model.JobApplication;
import org.example.jobseek.Repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;


    // get
    public List<JobApplication> getAllJobApplication(){
        return jobApplicationRepository.findAll();
    }

    // add
    public void addJobApplication(JobApplication jobApplication){
        jobApplicationRepository.save(jobApplication);
    }

    // update
    public boolean updateJobApplication(Integer jobApplicationID , JobApplication jobApplication){

        JobApplication oldJobApplication = jobApplicationRepository.getById(jobApplicationID);
        if(oldJobApplication == null){
            return false;
        }

        oldJobApplication.setJobPostID(jobApplication.getJobPostID());
        oldJobApplication.setUserID(jobApplication.getUserID());

        jobApplicationRepository.save(oldJobApplication);
        return true;
    }

    //delete

    public boolean deleteJobApplication(Integer jobApplicationID){

        JobApplication jobApplication = jobApplicationRepository.getById(jobApplicationID);
        if(jobApplication == null){
            return false;
        }

        jobApplicationRepository.delete(jobApplication);
        return true;
    }

    // get applications for a user
    public List<JobApplication> getApplicationsForUser(Integer userID){
        return jobApplicationRepository.findAll().stream().filter(a -> a.getUserID().equals(userID)).toList();
    }

}
