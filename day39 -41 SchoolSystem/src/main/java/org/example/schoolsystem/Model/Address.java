package org.example.schoolsystem.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Address {

    // area, street, buildingNumber

    @Id
    private Integer addressId;

    @NotEmpty(message = "area can not be empty")
    @Size(min = 3 , message = "area should be at least 3 characters")
    private String area;

    @NotEmpty(message = "street can not be empty")
    @Size(min = 3 , message = "street should be at least 3 characters")
    private String street;

    @NotNull(message = "buildingNumber can not be null")
    private Integer buildingNumber;


    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;


}
