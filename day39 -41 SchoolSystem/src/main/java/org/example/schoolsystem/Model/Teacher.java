package org.example.schoolsystem.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Teacher {

    // id, name, age, email, salary

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;

    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must contain only letters and spaces")
    private String name;

    @NotNull(message = "Age cannot be empty")
    @Min(value = 20, message = "error age  must be at least 20")
    private Integer age ;

    @Email(message = "error use a valid email format")
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    @NotNull(message = "Salary cannot be empty")
    @PositiveOrZero( message = "Salary must be greater than zero ")
    private Double salary;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "teacher")
    @PrimaryKeyJoinColumn
    private Address address;


    @OneToMany(cascade = CascadeType.ALL , mappedBy = "teacher")
    private Set<Course> course;

    @ManyToMany(mappedBy = "teachers")
    private Set<Student> students;


}
