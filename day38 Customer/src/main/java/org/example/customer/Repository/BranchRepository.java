package org.example.customer.Repository;


import org.example.customer.Model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch , Integer> {

    Branch findBranchByBranchId(Integer branchId);

    List<Branch> findBranchesByCity(String branchName);


}
