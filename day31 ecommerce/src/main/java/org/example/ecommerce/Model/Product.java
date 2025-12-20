package org.example.ecommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "product name can not be empty ! ")
    @Size(min = 3, message = "product name must be at least 3 characters ! ")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String productName;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "product price can not be empty !")
    @Min(value = 0 , message = " product price can not be less than zero ! ")

    @Column(columnDefinition = "DOUBLE NOT NULL")
    private Double productPrice;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "category id can not be empty ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer categoryID;

}