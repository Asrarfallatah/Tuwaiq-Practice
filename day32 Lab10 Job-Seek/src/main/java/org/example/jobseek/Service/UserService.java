package org.example.jobseek.Service;

import lombok.RequiredArgsConstructor;
import org.example.jobseek.Model.User;
import org.example.jobseek.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;


    // get

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    // add

    public void addUser(User user){
        userRepository.save(user);
    }

    // update

    public boolean updateUser(Integer userID , User user){

        User oldUser = userRepository.getById(userID);
        if(oldUser == null){
            return false;
        }

        oldUser.setUserName(user.getUserName());
        oldUser.setUserAge(user.getUserAge());
        oldUser.setUserEmail(user.getUserEmail());
        oldUser.setUserPassword(user.getUserPassword());
        oldUser.setUserRole(user.getUserRole());

        userRepository.save(oldUser);
        return true;
    }

    //delete

    public boolean deleteUser(Integer userID){

        User user = userRepository.getById(userID);
        if(user == null){
            return false;
        }

        userRepository.delete(user);

       return true;
    }

    // check user role
    public String getUserRole(Integer userID){
        User user = userRepository.getById(userID);
        if(user == null){
            return null;
        }
        return user.getUserRole();
    }


}
