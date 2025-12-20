package org.example.learningmanagementsystem.Model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CollegeFacilities {

    @NotEmpty(message = " facility name can not be empty ! ")
    private String facilityName;

    @NotEmpty(message = " facility purpose can not be empty ! ")
    private String facilityPurpose;

    @NotEmpty(message = " facility open time can not be empty ! ")
    private String facilityOpenTime;

    @NotEmpty(message = " facility close time can not be empty ! ")
    private String facilityCloseTime;

    @NotEmpty(message = " facility floor number can not be empty ! ")
    @Pattern(regexp = "ground|first|second|third", message = " floor number must be either : ground, first, second, third")
    private String facilityFloor;

    @NotNull(message = " facility room number can not be empty ! ")
    private Integer facilityRoomNumber;


    @NotNull(message = "third floor status can not be null !")
    @Pattern(regexp = "^(true|false)$",
            message = "isOnThirdFloor must be true or false")
    private String isOnThirdFloor;

    @NotEmpty(message = "safety stairs status can not be empty !")
    @Pattern(regexp = "^(yes|no)$",
            message = "safetyStairs must be yes or no")
    private String safetyStairs;


}
