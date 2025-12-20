package org.example.bankingmanagementsystem.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = " phone number can not be empty !")
    @Pattern( regexp = "^05\\d{8}$",
              message = " phone number must be 10 numbers , " +
             "and it must start with 05xxxxxxxx only !")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String PhoneNUmber;

    // Customer one-to-Many relationship with account
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Account> accounts;

    // customer have one-to-one relationship with user
    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;
}
