package org.example.projects.Controller;

import jakarta.validation.Valid;
import org.example.projects.ApiResponse.ApiResponse;
import org.example.projects.Model.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {

    ArrayList<Project> projects = new ArrayList<>();

    //get all
    @GetMapping("/get")
    public ArrayList <Project>  getAllProject(){
        return projects;
    }

    //add
    @PostMapping("/add")
    public ResponseEntity<?> addProject(@Valid @RequestBody Project project , Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        projects.add(project);
        return ResponseEntity.status(200).body(new ApiResponse ( "Project has been Added Successfully"));
    }


    //update
    @PutMapping("/update/{index}")
    public ResponseEntity<?> editProject(@Valid @RequestBody Project project, @PathVariable int index, Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        projects.set(index, project);
        return ResponseEntity.status(200).body(new ApiResponse ("Project has been Edited Successfully"));
    }

    //delete
    @DeleteMapping("/delete/{index}")
    public ResponseEntity<?>  deleteProject (@PathVariable int index){
        projects.remove(index);
        return ResponseEntity.status(200).body(new ApiResponse ( "Project has been Deleted Successfully"));
    }

    //change project Status
    @PutMapping ("/change/{title}/{status}")
    public ResponseEntity<?> changeStatus (@PathVariable String title ,@PathVariable String status){

        for (Project project : projects){
            if (project.getTitle().equalsIgnoreCase(title)){

                if (    !status.equalsIgnoreCase("Not Started") &&
                        !status.equalsIgnoreCase("In Progress") &&
                        !status.equalsIgnoreCase("Completed")) {

                    return ResponseEntity.status(400).body(
                            new ApiResponse("status must be: not started, in progress, or completed")
                    );
                }

                project.setStatus(status);
                return ResponseEntity.status(200).body(new ApiResponse("Status updated Successfully"));
            }
        }

        return ResponseEntity.status(400).body(new ApiResponse("error: no project with same title to find "));
    }

    // find project by title
    @GetMapping("/title/{title}")
    public ResponseEntity<?> findByTitle(@PathVariable String title){

        for (Project project : projects){
            if (project.getTitle().equalsIgnoreCase(title)){
                return ResponseEntity.status(200).body(project);
            }
        }

        return ResponseEntity.status(400).body(new ApiResponse("no project with same title to find "));

    }

    //find company Projects
    @GetMapping("/company/{companyName}")
    public ResponseEntity<?> findByCompanyName (@PathVariable String companyName ){

        ArrayList <Project> companyProject = new ArrayList<>();

        for (Project project : projects){
            if (project.getCompanyName().equalsIgnoreCase(companyName)){
                companyProject.add(project);
            }
        }

        return ResponseEntity.status(200).body(companyProject);
    }
}
