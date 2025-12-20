package org.example.customer.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;


    private String name;


    // cascade type all because if we delete customer profile should be deleted too
    // mappedBy to avoid extra table creation
    @OneToOne(cascade = CascadeType.ALL , mappedBy = "customer")
    // primary key join column to make customerId as primary key in profile table
    @PrimaryKeyJoinColumn
    private Profile profile;

    @ManyToMany
    @JsonIgnore
    // we put JsonIgnore to avoid infinite recursion
    private Set<Merchant> merchants;
}
