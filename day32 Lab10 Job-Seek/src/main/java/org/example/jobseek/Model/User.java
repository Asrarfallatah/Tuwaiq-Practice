package org.example.jobseek.Model;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer userID;

    /// ////////////////////////////////////////////

    @NotEmpty(message = " Error User Name Can Not Be Empty ! ")
    @Size(min = 4 , message = " Error User Name Can Not Be Less Than 4 Characters ! ")
    @Pattern(regexp = "^[A-Za-z]+$" , message = "Error User Name Must Contains Characters Only ! ")
  //   @Column(columnDefinition = "VARCHAR(30) NOT NULL CHECK (LENGTH(user_name) >= 4 AND user_name REGEXP '^[A-Za-z]+$')")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL ")
    private String userName;

    /// ////////////////////////////////////////////

    @Email(message = " Error Please Enter A Valid Email ! ")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL ")
    private String userEmail;

    /// ////////////////////////////////////////////

    @NotEmpty(message = " Error User Password Can Not Be Empty ! ")
    @Pattern(  regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$",
            message = " Error Password Must Contain: 1 uppercase, 1 lowercase, 1 digit, 1 special character and length 8-20 ! ")
 //   @Column(columnDefinition = "VARCHAR(30) NOT NULL CHECK (LENGTH(user_password) BETWEEN 8 AND 20)")
    @Column(columnDefinition = "VARCHAR(30) NOT NULL ")

    private String userPassword;

    /// ////////////////////////////////////////////

    @NotNull(message = " Error User Age Can Not Be Empty ! ")
    @Min(value = 21 , message = " Error User Age Must be At Least 21 ! ")
   // @Pattern(regexp = "^\\d+$\n", message = " Error User Age Must Contains Numbers Only ! ")

  //  @Column(columnDefinition = "INT NOT NULL CHECK (user_age >= 21) ")
    @Column(columnDefinition = "INT NOT NULL ")
    private Integer userAge;

    /// ////////////////////////////////////////////

    @NotEmpty(message = " Error User Role Can Not Be Empty ! ")
    @Pattern(regexp = "^(Job_Seeker|JOB_SEEKER|job_seeker|Employer|EMPLOYER|employer)$",
             message = " Error User Role Must Be One Of The Following : ( Job_Seeker or Employer only ) ! ")

    //@Column(columnDefinition = "VARCHAR(30) NOT NULL CHECK (user_role IN ('Job_Seeker', 'JOB_SEEKER', 'job_seeker', 'Employer', 'EMPLOYER', 'employer'))  ")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL  ")
    private String userRole;




}
