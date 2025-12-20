package org.example.uusermanagementsystem.Repository;

import org.example.uusermanagementsystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUserID(Integer userID);

    // extra end points

    // check if user-name and password are correct !!

    User findUserByUserUserNameAndUserPassword(String userUserName , String userPassword);

    // get users by email
    User findUserByUserEmail(String userEmail);


    // get all users with specific role
    List<User> findAllByUserRole(String userRole);


    // get all users with specific age or above

    List<User> findAllByUserAgeGreaterThanEqual(Integer userAge);



    // JPQL version !

    @Query("select u from User u where u.userUserName = ?1 and u.userPassword = ?2")
    User checkLoginJPQL(String userUserName , String userPassword);


    @Query("select u from User u where u.userEmail = ?1")
    User getUserByEmailJPQL(String email);

    @Query("select u from User u where u.userRole = ?1")
    List<User> getUsersByRoleJPQL(String role);

    @Query("select u from User u where u.userAge >= ?1")
    List<User> getUsersByAgeOrAboveJPQL(Integer age);

}
