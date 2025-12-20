package org.example.learningmanagementsystem.Model;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CollegeCafeteria {


    @NotEmpty(message = "cafeteria food type can not be empty !")
    @Pattern(regexp = "^(drinks|desserts|lunch|breakfast|dinner)$",
            message = " cafeteria food type must be one of the following drinks, desserts, lunch, breakfast, dinner")
    private String cafeteriaFoodType;

    @NotEmpty(message = " your food order can not be empty ! ")
    private String cafeteriaFoodOrdered;

    @NotEmpty(message = " your food order can not be empty ! ")
    private String cafeteriaFoodOrderedID;

    @NotNull(message = "food price can not be null ! ")
    @Min(value = 0, message = "food price can not be less than zero ! ")
    private double cafeteriaFoodPrice;


}
