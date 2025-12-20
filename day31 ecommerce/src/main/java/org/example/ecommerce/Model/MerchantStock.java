package org.example.ecommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class MerchantStock {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer merchantStockID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "product Id can not be empty !")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer productID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "merchant id can not be empty ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer merchantID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "merchant stock can not be empty ! ")
    @Min(value = 10, message = "merchant stock must be at least 10 ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer merchantStock;


}