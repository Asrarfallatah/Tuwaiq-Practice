package org.example.schoolsystem.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Student {

    // id name age major
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotNull(message = "age can not be null")
    private Integer age;

    @NotEmpty(message = "major cannot be empty")
    private String major;

    @ManyToMany
    @JsonIgnore
    private Set<Teacher> teachers;


}
