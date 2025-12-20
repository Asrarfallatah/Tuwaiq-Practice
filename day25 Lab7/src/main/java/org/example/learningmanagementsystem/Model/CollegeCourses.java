package org.example.learningmanagementsystem.Model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CollegeCourses {

    @NotEmpty(message = " course name can not be empty ! ")
    public String courseName;

    @NotEmpty(message = " course ID can not be empty ! ")
    public String courseID;

    @NotEmpty(message = " course content can not be empty ! ")
    @Size(min = 20 , message = " course content can not be empty ! ")
    public String courseContent;

    @NotNull(message = " course credit hour can not be empty !")
    @Min(value = 1, message = "course credit hour can not be less than 1 hour ! ")
    @Max(value = 10, message = "course credit hour can not be greater than 10 hours !")
    public int courseCreditHour;

    @NotNull(message = " course weekly hour can not be empty ! ")
    @Min(value = 1, message = "course weekly hour can not be less than 1 hour ! ")
    @Min(value = 10, message = "course weekly hour can not be less than 10 hour ! ")
    public Integer courseWeeklyHour;

    @NotNull(message = " course Lab status can not be empty ! ")
    @Pattern(regexp = "^(true|false)$" , message = " course Lab status must be set to false ! ")
    public String hasLab ;


}
