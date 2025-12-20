package org.example.ecommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "User ID can not be empty ! ")
    @Min(value = 1 , message = "User ID must be a positive number ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer userID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "Product ID can not be empty ! ")
    @Min(value = 1 , message = "Product ID must be a positive number ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer productID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "Merchant ID can not be empty ! ")
    @Min(value = 1 , message = "Merchant ID must be a positive number ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer merchantID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "Price can not be empty ! ")
    @Min(value = 1 , message = "Price must be more than 0 ! ")

    @Column(columnDefinition = "DOUBLE NOT NULL")
    private Double price;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "Purchase date can not be empty ! ")

    @Column(columnDefinition = "DATETIME NOT NULL")
    private LocalDateTime createdAt;

}

