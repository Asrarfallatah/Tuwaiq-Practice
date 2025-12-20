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
public class Category {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "category name can not be empty ! ")
    @Size(min = 3, message = "category name must be at least 3 characters ! ")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String categoryName;


}