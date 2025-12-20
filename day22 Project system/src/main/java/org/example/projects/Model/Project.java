package org.example.projects.Model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project {

    @NotNull(message = "id cannot be null")
    private  int    ID;

    @NotNull(message = "title cannot be null")
    @Size (min = 8, message = "title must be more than 8 characters")
    private  String title;

    @NotNull(message = "description cannot be null")
    @Size(min = 15, message = "description must be more than 15 characters")
    private  String description;

    @NotNull(message = "Status cannot be null")
    @Pattern(regexp = "^(Not Started|In Progress|Completed)$",
            message = "status must be either: not started, in progress, or completed")
    private  String status;

    @NotNull(message = "company name cannot be null")
    @Size(min = 6, message = "company name must be more than 6 characters")

    private  String companyName;

}
