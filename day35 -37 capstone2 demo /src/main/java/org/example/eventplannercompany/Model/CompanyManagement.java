package org.example.eventplannercompany.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompanyManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyManagementId;

    /// //////////////////////////////////////////////////////////

    @Column(columnDefinition = "VARCHAR(25)")
    private String companyManagementApprovalStatus;

    /// //////////////////////////////////////////////////////////

    @NotEmpty(message = "error management statement can not be empty !")

    @Column(columnDefinition = "VARCHAR(100) ")
    private String companyManagementStatement;

    /// //////////////////////////////////////////////////////////

    @Column(columnDefinition = "INT")
    private Integer assignedRepresentativeTeamId;

    /// //////////////////////////////////////////////////////////

    @NotNull(message = "error client request id can not be empty !")

    @Column(columnDefinition = "INT ")
    private Integer clientRequestId;

    /// //////////////////////////////////////////////////////////

    @NotNull(message = "error client id can not be empty !")

    @Column(columnDefinition = "INT ")
    private Integer clientId;

    /// //////////////////////////////////////////////////////////

    @NotNull(message = "error company id can not be empty !")

    @Column(columnDefinition = "INT ")
    private Integer companyId;

}
