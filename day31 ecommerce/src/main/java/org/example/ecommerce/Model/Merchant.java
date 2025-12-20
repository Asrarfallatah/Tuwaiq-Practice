package org.example.ecommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Merchant {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer merchantID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "merchant name can not be empty ! ")
    @Size(min = 3, message = "merchant name must be at least 3 characters ! ")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String merchantName;


}

