package org.example.uusermanagementsystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class User {


    @NotNull(message = "error user id can not be null !")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    /// //////////////////////////////////////////////////////////

    @Size(min = 4 , message = " error user name can not be less than 4 characters ! ")
    @NotEmpty(message = "error user name can not be empty !")

    @Column(columnDefinition = " Var(30) NOT NULL ")
    private String userName;

    /// //////////////////////////////////////////////////////////

    @Size(min = 4 , message = " error user' username can not be less than 4 characters ! ")
    @NotEmpty(message = "error user' username can not be empty !")

    @Column(columnDefinition = " Var(30) NOT NULL UNIQUE")
    private String userUserName;

    /// //////////////////////////////////////////////////////////

    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$" ,
             message = "password must be at leat 8 characters long" +
                       " and have at least one digit , " +
                       "one lowercase letter , " +
                       "one uppercase letter !")
    @NotEmpty(message = "error user password can not be empty !")

    @Column(columnDefinition = " Var(30) NOT NULL ")
    private String userPassword;

    /// //////////////////////////////////////////////////////////

    @Email(message = "error please enter a valid email !")
    @NotEmpty(message = "error user email can not be empty !")

    @Column(columnDefinition = " Var(30) NOT NULL UNIQUE")
    private String userEmail;

    /// //////////////////////////////////////////////////////////

    @NotEmpty(message = "error user role can not be empty !")
    @Pattern(regexp = "^(user|User|USER|admin|Admin|ADMIN)$",message = "error role must be either admin or user !")

    @Column(columnDefinition = " Var(30) NOT NULL ")
    private String userRole;

    /// //////////////////////////////////////////////////////////

    @NotNull(message = "error user age can not be empty !")
    @Min(value = 0, message = "error user age can not be negative!")

    @Column(columnDefinition = " INT NOT NULL ")
    private Integer userAge;



}
