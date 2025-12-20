package org.example.coffeejpa.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeID;

    /// ////////////////////////////////////////////////////////////

    @NotEmpty(message = " Error name can not be empty ! ")
    @Size(min = 3 , message = " Error name can not be less than three characters ! ")

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String employeeName;

    /// ////////////////////////////////////////////////////////////

    @NotNull(message = " Error salary can not be empty ! ")
    @Min(value = 0 , message = " Error salary can not be less than zero ! ")

    @Column(columnDefinition = "INT NOT NULL")
    private Integer getEmployeeSalary;

}
