package org.example.jobseek.Service;

import lombok.RequiredArgsConstructor;
import org.example.jobseek.Model.JobPost;
import org.example.jobseek.Repository.JobPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobPostService {


    private final JobPostRepository jobPostRepository;


    // get

    public List<JobPost> getAllJobPost(){
        return jobPostRepository.findAll();
    }

    // add

    public void addJobPost(JobPost jobPost){
        jobPostRepository.save(jobPost);
    }

    // update

    public boolean updateJobPost(Integer jobPostID , JobPost jobPost){

        JobPost oldJobPost = jobPostRepository.getById(jobPostID);
        if(oldJobPost == null){
            return false;
        }

        oldJobPost.setJobPostDate(jobPost.getJobPostDate());
        oldJobPost.setJobPostTitle(jobPost.getJobPostTitle());
        oldJobPost.setJobPostDescription(jobPost.getJobPostDescription());
        oldJobPost.setJobPostSalary(jobPost.getJobPostSalary());
        oldJobPost.setJobPostLocation(jobPost.getJobPostLocation());

        jobPostRepository.save(oldJobPost);
        return true;
    }

    //delete

    public boolean deleteJobPost(Integer jobPostID){

        JobPost jobPost = jobPostRepository.getById(jobPostID);
        if(jobPost == null){
            return false;
        }

        jobPostRepository.delete(jobPost);
        return true;
    }


    // search by job title
    public List<JobPost> searchByTitle(String title){
        return jobPostRepository.findAll().stream().filter(j -> j.getJobPostTitle().equalsIgnoreCase(title)).toList();
    }


}
