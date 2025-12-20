package org.example.tracker.Model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project {

    private  int    ID;
    private  String title;
    private  String description;
    private  String status;
    private  String companyName;

}
