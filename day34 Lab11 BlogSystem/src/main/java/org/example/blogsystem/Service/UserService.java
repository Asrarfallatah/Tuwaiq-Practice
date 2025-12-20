package org.example.blogsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.blogsystem.Model.User;
import org.example.blogsystem.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    // create connection to the DataBase
    private final UserRepository userRepository;


    // get all user information from the DataBase
    public List<User> getAllUsers (){
        return userRepository.findAll();
    }

    // add a user information to the DataBase
    public void addUser(User user){
        userRepository.save(user);
    }

    // update user information in the DataBase
    public boolean updateUser(Integer userID, User user) {

        // check if is it in the DataBase first
        User oldUser = userRepository.findUserByUserId(userID);
        if (oldUser == null) {
            return false;
        }

        // update information
        oldUser.setUserName(user.getUserName());
        oldUser.setUserPassword(user.getUserPassword());
        oldUser.setUserEmail(user.getUserEmail());
        oldUser.setUserRegistrationDate(user.getUserRegistrationDate());

        // save it
        userRepository.save(oldUser);
        return true;
    }


    // delete user information from the DataBase

    public boolean deleteUser(Integer userID) {

        // check if is it in the DataBase first
        User user = userRepository.findUserByUserId(userID);
        if (user == null) {
            return false;
        }

        // delete it
        userRepository.delete(user);
        return true;
    }


    // extra end points

       ///  JPQL

          //4- get users by after a specific registration date
            public List<User> getUsersRegisteredAfter(LocalDateTime date){

              return  userRepository.getUsersRegisteredAfter(date);

            }







}
