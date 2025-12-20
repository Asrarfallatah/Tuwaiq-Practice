package org.example.bankingmanagementsystem.Repository;

import org.example.bankingmanagementsystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById (Integer id);
    User findUserByUsername (String username);
    List<User> findUsersByRole (String role);
}
