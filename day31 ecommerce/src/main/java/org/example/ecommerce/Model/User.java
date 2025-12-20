package org.example.ecommerce.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "User name can not be empty !")
    @Size(min = 5, message = "User Name have to be at least 5 characters !")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String userName;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "User password can not be empty ! ")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d).+$", message = "User password must have at least one character and one digits !")
    @Size(min = 6, message = "User password must be at least 6 characters !")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL ")
    private String userPassword;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "user email can not be empty !")
    @Email(message = "please enter a valid email !")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL")
    private String userEmail;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotEmpty(message = "User role can not be empty !")
    @Pattern(regexp = "^(admin|Admin|customer|Customer)$", message = "User role must be either customer or admin !")

    @Column(columnDefinition = "VARCHAR(20) NOT NULL ")
    private String userRole;

    /// ///////////////////////////////////////////// ///////////////////////////////////////////// ///////////////////////////////////////////// //////////////////////////////////////////

    @NotNull(message = "Balance can not be Empty !")
    @Min(value = 0, message = "User Balance can not be less than zero !")

    @Column(columnDefinition = "DOUBLE NOT NULL")
    private Double userBalance;


}
