package org.example.blogsystem.Repository;

import org.example.blogsystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUserId(Integer userId);


    /// JPQL

    //4- get users by after a specific registration date
    @Query("select u from User u where u.userRegistrationDate > ?1")
    List<User> getUsersRegisteredAfter(LocalDateTime date);





}
