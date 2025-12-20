package org.example.coffeejpa.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Coffee {

//    @NotNull(message = "coffee id can not be empty ! ")
//    @Size(min = 3 , message = "coffee id can not be less than 3 character ! ")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coffeeID;

    /// //////////////////// //////////////////// //////////////////// /////////////////

    @NotEmpty(message = "coffee name can not be empty ! ")
    @Size(min = 4 , message = "coffee Name can not be less than 4 character ! ")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String coffeeName;

    /// //////////////////// //////////////////// //////////////////// /////////////////

    @NotEmpty(message = "coffee category can not be empty ! ")
    @Size(min = 4 , message = "coffee Category can not be less than 4 character ! ")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String coffeeCategory;

    /// //////////////////// //////////////////// //////////////////// /////////////////

    @NotNull(message = " coffee price can not be empty ! ")
    @Min(value = 0 , message = "coffee price can not be less than zero ! ")

    @Column(columnDefinition = "DOUBLE NOT NULL")
    private Double coffeePrice;

    /// ////////////////////////////////////////////////////////////////////////////////

    @Column(columnDefinition = "INT NOT NULL")
    private Integer employeeID;

}
