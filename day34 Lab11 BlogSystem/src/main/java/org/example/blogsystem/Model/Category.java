package org.example.blogsystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId ;

    /// //////////////////////////////////////////////////

    @NotEmpty(message = "error category name can not be empty ! ")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL UNIQUE")
    private String categoryName ;




}
