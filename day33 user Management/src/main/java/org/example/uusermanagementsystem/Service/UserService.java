package org.example.uusermanagementsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.uusermanagementsystem.Model.User;
import org.example.uusermanagementsystem.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    // get all users
    public List<User> getUserRepository() {
        return userRepository.findAll();
    }

    // add user
    public void addUser(User user){
        userRepository.save(user);
    }

    // update user
    public boolean updateUser(Integer userID, User user){

        User oldUser = userRepository.findUserByUserID(userID);
        if (oldUser == null){
            return false;
        }

        oldUser.setUserName(user.getUserName());
        oldUser.setUserUserName(user.getUserUserName());
        oldUser.setUserPassword(user.getUserPassword());
        oldUser.setUserEmail(user.getUserEmail());
        oldUser.setUserRole(user.getUserRole());
        oldUser.setUserAge(user.getUserAge());

        userRepository.save(oldUser);
        return true;
    }

    // delete user
    public boolean deleteUser(Integer userID){

        User user = userRepository.findUserByUserID(userID);

        if (user == null){
            return false;
        }

        userRepository.delete(user);
        return true;
    }

    // extra end points

    // check if user-name and password are correct !!
    public User checkUserLogin(String userUserName , String userPassword){

        User user = userRepository.findUserByUserUserNameAndUserPassword(userUserName , userPassword);

        if (user == null){
            return null;
        }

        return user;
    }

    // get users by email

    public User getByEmail(String userEmail){

        User user = userRepository.findUserByUserEmail(userEmail);

        if (user == null){
            return null;
        }

        return user;
    }

    // get all users with specific role

    public List<User> getUsersByRole(String userRole){

        return userRepository.findAllByUserRole(userRole);
    }


    // get all users with specific age or above

    public List<User> getUsersByAgeOrAbove(Integer userAge){
        return userRepository.findAllByUserAgeGreaterThanEqual(userAge);
    }


    // JPQL version !

    public User checkUserLoginJPQL(String userUserName , String password){

        User user = userRepository.checkLoginJPQL(userUserName , password);

        if (user == null){
            return null;
        }

        return user;
    }

    public User getByEmailJPQL(String userEmail){

        User user = userRepository.getUserByEmailJPQL(userEmail);

        if (user == null){
            return null;
        }

        return user;
    }

    public List<User> getUsersByRoleJPQL(String userRole){
        return userRepository.getUsersByRoleJPQL(userRole);
    }


    public List<User> getUsersByAgeOrAboveJPQL(Integer userAge){
        return userRepository.getUsersByAgeOrAboveJPQL(userAge);
    }




}
