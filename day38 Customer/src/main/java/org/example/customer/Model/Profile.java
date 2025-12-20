package org.example.customer.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Profile {

    // we don't need to generate value here because profileId will be same as customerId
    @Id
    private Integer profileId;


    private Integer age ;


    private String email;


    private String address;


    private String phoneNumber;


    @OneToOne
    // variable name like the one in mappedBy in Customer class
    @MapsId
    // we make map id to use customerId as profileId
    @JsonIgnore
    // we make this ignore to avoid infinite recursion
    private Customer customer;


}
