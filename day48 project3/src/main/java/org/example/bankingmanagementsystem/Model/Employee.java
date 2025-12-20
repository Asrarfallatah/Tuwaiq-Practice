package org.example.bankingmanagementsystem.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = " position can not be empty !")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String position;

    @NotNull(message = " salary can not be null !")
    @PositiveOrZero(message = " salary can not be less than zero !")
    @Column(columnDefinition = "DOUBLE NOT NULL")
    private Double salary;

    // Employee many-to-One relationship with UserRepository
    @OneToOne
    @MapsId
    @JsonIgnore
    private User user;
}
