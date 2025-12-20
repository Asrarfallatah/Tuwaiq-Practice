package org.example.bankingmanagementsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = " account number can not be empty !")
    @Pattern(regexp = "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$\n" ,
             message = " account number must be in the format XXXX-XXXX-XXXX-XXXX , " +
                       "where X is a digit (0-9) !")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String accountNumber;

    @Pattern(regexp = "^(false|False|FALSE)$", message = " New accounts must be by default false !")
    @NotEmpty(message = " isActive can not be empty !")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String isActive;

    @PositiveOrZero(message = " Balance can not be less than zero !")
    @Column(columnDefinition = "DOUBLE NOT NULL")
    private Double Balance;

    // account have Many-to-One relationship with Customer
    @ManyToOne
    @JsonIgnore
    private Customer customer;


}
