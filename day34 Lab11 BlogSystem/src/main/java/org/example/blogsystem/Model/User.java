package org.example.blogsystem.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer userId ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error user name can not be empty !")
    @Size(min = 3 , message = "error user name must be at least 3 characters long !")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL ")
    private String userName ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error user password can not be empty !")
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$",
             message = "error user password must be at least 8 characters, " +
                       "contains one upper case letter, one lower case letter, " +
                       "one digit, and one special character (#?!@$ %^&*-) !")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL ")
    private String userPassword ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error user email can not be empty !")
    @Email(message = "error please enter a valid email !")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL ")
    private String userEmail ;

    /// //////////////////////////////////////////////////

    @NotNull(message = "error user registration date can not be empty ! ")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")

    @Column(columnDefinition = "DATETIME")
    private LocalDateTime userRegistrationDate;



}
