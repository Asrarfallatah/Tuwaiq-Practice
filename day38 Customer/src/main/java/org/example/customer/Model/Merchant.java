package org.example.customer.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer merchantId;

    private String name;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "merchant")
    private Set<Branch> branches;

    @ManyToMany(mappedBy = "merchants")
    // if we create mappedBy here we don't put JsonIgnore
    private Set<Customer> customers;

}
