package org.example.bankingmanagementsystem.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = " UserName can not be empty !")
    @Size(min= 6 , max = 50 , message = " username can not be less than 6 characters or longer than 50 characters !")
    @Column(columnDefinition = "TEXT UNIQUE NOT NULL")
    private String username;

    @NotEmpty(message = "password can not be empty !")
    @Pattern(regexp =   "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$",
             message =  "Password must be at least 6 characters long , " +
                        "and include at least one uppercase letter, " +
                        "one lowercase letter," +
                        " one digit, " +
                        "and one special character.")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String password;

    @NotEmpty(message = " Name can not be empty !")
    @Size(min = 2 , max = 20 , message = " Name can not be less than 2 characters or longer than 20 characters !")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String name;

    @Email(message = " Email should be valid !")
    @NotEmpty(message = " email can not be empty !")
    @Column(columnDefinition = "TEXT UNIQUE NOT NULL")
    private String email;

    @NotEmpty(message = " Role can not be empty !")
    @Pattern( regexp = "^(ADMIN|EMPLOYEE|CUSTOMER)$",
              message = " Role must be either : ADMIN, EMPLOYEE, or CUSTOMER only !")
    @Column(columnDefinition = "TEXT NOT NULL")
    private String role;

    // UserRepository one-to-one relationship with employee
    @OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
    @PrimaryKeyJoinColumn
    private Employee employee;

    // UserRepository one-to-one relationship with customer
    @OneToOne(cascade = CascadeType.ALL , mappedBy = "user")
    @PrimaryKeyJoinColumn
    private Customer customer;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
