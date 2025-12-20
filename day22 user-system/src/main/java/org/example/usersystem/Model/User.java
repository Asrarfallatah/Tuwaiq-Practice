package org.example.usersystem.Model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    @Size(min = 4 , max= 20 , message = "user name can not be less than 4 character or larger than 20") //we use this just for String
    @NotEmpty(message = "User name can not be empty")
    private String userName;

    @NotEmpty(message = "password can not be empty")
    @Pattern( regexp = "^(?=.*[A-Za-z]).+$",
              message = "password must contain at least characters " )
    private String password;

    @Email
    private String email;

    @NotNull
    @Min(18)
    @Max(100)
    private int age;

}
