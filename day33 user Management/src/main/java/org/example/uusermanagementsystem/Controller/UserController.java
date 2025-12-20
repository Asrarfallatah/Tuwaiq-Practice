package org.example.uusermanagementsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.uusermanagementsystem.ApiResponse.ApiResponse;
import org.example.uusermanagementsystem.Model.User;
import org.example.uusermanagementsystem.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {


    public final UserService userService;

    // get all users
    @GetMapping("/get")
    public ResponseEntity<?> getUsers(){

        if (userService.getUserRepository().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no users yet in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(userService.getUserRepository());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@Valid @RequestBody User user , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        userService.addUser(user);
        return ResponseEntity.status(200).body(new ApiResponse("user information has been added to the DataBase Successfully ! "));
    }

    // update
    @PutMapping("/update/{userID}")
    public ResponseEntity<?> updateUser(@PathVariable Integer userID , @Valid @RequestBody User user , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = userService.updateUser(userID, user);

        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no user with that ID in the DataBase with that id is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("user information has been updated Successfully ! "));
    }

    // delete
    @DeleteMapping("/delete/{userID}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer userID){

        boolean isDeleted = userService.deleteUser(userID);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no user with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("user information has been deleted Successfully ! "));
    }


    // extra end points

    // check if user-name and password are correct !!
    @GetMapping("/login/{username}/{password}")
    public ResponseEntity<?> checkLogin(@PathVariable String username , @PathVariable String password){

        User user = userService.checkUserLogin(username , password);

        if (user == null){
            return ResponseEntity.status(400).body(new ApiResponse("error username or password is wrong ! "));
        }

        return ResponseEntity.status(200).body(user);
    }

    // get users by email

    @GetMapping("/get-email/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email){

        User user = userService.getByEmail(email);

        if (user == null){
            return ResponseEntity.status(400).body(new ApiResponse("error no user with that email ! "));
        }

        return ResponseEntity.status(200).body(user);
    }


    // get all users with specific role

    @GetMapping("/get-role/{role}")
    public ResponseEntity<?> getUsersByRole(@PathVariable String role){

        List<User> users = userService.getUsersByRole(role);

        if (users.isEmpty()|| users == null){
            return ResponseEntity.status(400).body(new ApiResponse("error no users with that role ! "));
        }

        return ResponseEntity.status(200).body(users);
    }



    // get all users with specific age or above

    @GetMapping("/get-age/{age}")
    public ResponseEntity<?> getUsersByAgeOrAbove(@PathVariable Integer age){

        List<User> users = userService.getUsersByAgeOrAbove(age);

        if (users.isEmpty()|| users == null){
            return ResponseEntity.status(400).body(new ApiResponse("error no users with that age or above ! "));
        }

        return ResponseEntity.status(200).body(users);
    }


    // JPQL version !

    @GetMapping("/logins/{userUserName}/{userPassword}")
    public ResponseEntity<?> checkLoginJPQL(@PathVariable String userUserName , @PathVariable String userPassword){

        User user = userService.checkUserLoginJPQL(userUserName , userPassword);

        if (user == null){
            return ResponseEntity.status(400).body(new ApiResponse("error username or password is wrong ! "));
        }

        return ResponseEntity.status(200).body(user);
    }

    @GetMapping("/get-emails/{userEmail}")
    public ResponseEntity<?> getUserByEmailJPQL(@PathVariable String userEmail){

        User user = userService.getByEmailJPQL(userEmail);

        if (user == null){
            return ResponseEntity.status(400).body(new ApiResponse("error no user with that email ! "));
        }

        return ResponseEntity.status(200).body(user);
    }

    @GetMapping("/get-roles/{userRole}")
    public ResponseEntity<?> getUsersByRoleJPQL(@PathVariable String userRole){

        List<User> users = userService.getUsersByRoleJPQL(userRole);

        if (users.isEmpty()|| users == null){
            return ResponseEntity.status(400).body(new ApiResponse("error no users with that role ! "));
        }

        return ResponseEntity.status(200).body(users);
    }

    @GetMapping("/get-ages/{userAge}")
    public ResponseEntity<?> getUsersByAgeOrAboveJPQL(@PathVariable Integer userAge){

        List<User> users = userService.getUsersByAgeOrAboveJPQL(userAge);

        if (users.isEmpty() || users == null){
            return ResponseEntity.status(400).body(new ApiResponse("error no users with that age or above ! "));
        }

        return ResponseEntity.status(200).body(users);
    }



}
