package org.example.bankingmanagementsystem.Repository;


import org.example.bankingmanagementsystem.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Account findAccountById (Integer id);
}
