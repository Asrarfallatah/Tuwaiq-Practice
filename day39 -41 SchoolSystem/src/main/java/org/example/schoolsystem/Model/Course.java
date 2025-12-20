package org.example.schoolsystem.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Course {

    // id , name

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;


    @NotEmpty(message = "courseName can not be empty")
    private String courseName;

    @ManyToOne
    @JsonIgnore
    private Teacher teacher;

}
