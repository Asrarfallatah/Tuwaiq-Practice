package org.example.jobseek.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer jobPostID;

    /// ////////////////////////////////////////////

    @NotEmpty(message = " Error Job Title Can Not Be Empty ! ")
    @Size(min = 4 , message = " Error Job Title Can Not Be Less Than 4 Characters ! ")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL CHECK (LENGTH(job_post_title) >= 4) ")
    private String jobPostTitle;

    /// ////////////////////////////////////////////

    @NotEmpty(message = " Error Job Description Can Not Be Empty ! ")

    @Column(columnDefinition = "VARCHAR(50) NOT NULL ")
    private String jobPostDescription;

    /// ////////////////////////////////////////////

    @NotEmpty(message = " Error Job Location Can Not Be Empty ! ")

    @Column(columnDefinition = "VARCHAR(25) NOT NULL ")
    private String jobPostLocation;

    /// ////////////////////////////////////////////

    @NotNull(message = " Error Job Salary Can Not Be Empty ! ")
    @Min(value = 0 , message = " Error Job Salary Can Not Be Less Than Zero ! ")

  //  @Column(columnDefinition = "DOUBLE NOT NULL CHECK (job_post_salary >= 0) ")
    @Column(columnDefinition = "DOUBLE NOT NULL ")
    private Double jobPostSalary;

    /// ////////////////////////////////////////////

    @NotNull(message = " Error Job Date Can Not Be Empty ! ")
    @JsonFormat(pattern = "yyyy-MM-dd")

    @Column(columnDefinition = "DATE NOT NULL ")
    private LocalDate jobPostDate;


}
