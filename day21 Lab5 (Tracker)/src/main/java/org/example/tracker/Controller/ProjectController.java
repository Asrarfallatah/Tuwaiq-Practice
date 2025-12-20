package org.example.tracker.Controller;

import org.example.tracker.Model.Project;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {

    ArrayList <Project> projects = new ArrayList<>();

    //get all
    @GetMapping("/get")
    public ArrayList <Project>  getAllProject(){
        return projects;
    }

    //add
    @PostMapping("/add")
    public String addProject(@RequestBody Project project){
        projects.add(project);
        return "Project has been Added Successfully";
    }


    //update
    @PutMapping("/update/{index}")
    public String editProject(@RequestBody Project project,@PathVariable int index){
        projects.set(index, project);
        return "Project has been Edited Successfully";
    }

    //delete
    @DeleteMapping("/delete/{index}")
    public String deleteProject (@PathVariable int index){
        projects.remove(index);
        return "Project has been Deleted Successfully";
    }

    //change project Status
    @PutMapping ("/change/{title}/{status}")
    public String changeStatus (@PathVariable String title ,@PathVariable String status){

        for (Project project : projects){
            if (project.getTitle().equalsIgnoreCase(title)){
                project.setStatus(status);
                return project.getTitle() +" status has been updated Successfully";
            }
        }

        return "Error there is no project with that title to update its status ! ";
    }

    // find project by title
    @GetMapping("/title/{title}")
    public Project findByTitle(@PathVariable String title){

        for (Project project : projects){
            if (project.getTitle().equalsIgnoreCase(title)){
                return project;
            }
        }

        return null;
    }

    //find company Projects
    @GetMapping("/company/{companyName}")
    public ArrayList <Project> findByCompanyName (@PathVariable String companyName ){

        ArrayList <Project> companyProject = new ArrayList<>();

        for (Project project : projects){
            if (project.getCompanyName().equalsIgnoreCase(companyName)){
                companyProject.add(project);
            }
        }

        return companyProject;
    }


}
