package org.example.jobseek.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer jobApplicationID;

    /// ///////////////////////////////////////////////////////////////////

    @NotNull(message = " Error User ID Can Not Be Empty ! ")

    @Column(columnDefinition = " INT NOT NULL ")
     private Integer userID;

    /// /////////////////////////////////////////////////////////////////////

    @NotNull(message = " Error Job Post ID Can Not Be Empty ! ")

    @Column(columnDefinition = " INT NOT NULL ")
    private Integer jobPostID;
}
