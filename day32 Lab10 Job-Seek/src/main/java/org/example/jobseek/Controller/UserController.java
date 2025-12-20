package org.example.jobseek.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.jobseek.ApiResponse.ApiResponse;
import org.example.jobseek.Model.User;
import org.example.jobseek.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    public final UserService userService;

    // get all users
    @GetMapping("/get")
    public ResponseEntity<?> getUsers(){

        if (userService.getAllUsers().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no users in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(userService.getAllUsers());
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
            return ResponseEntity.status(400).body(new ApiResponse("no user with that ID in the DataBase  is found to update it ! "));
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

}
