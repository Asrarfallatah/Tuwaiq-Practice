package org.example.blogsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.blogsystem.ApiResponse.ApiResponse;
import org.example.blogsystem.Model.User;
import org.example.blogsystem.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {


    // create connection with Service
    private final UserService userService;


    // get
    @GetMapping("/get")
    public ResponseEntity<?> getUsers(){

        if (userService.getAllUsers().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no users yet in the DataBase to show their information !"));
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

        ///  JPQL

            //4- get users by after a specific registration date

            @GetMapping("/get-by-date")
            public ResponseEntity<?> getUsersRegisteredAfter(LocalDateTime date){

                if (userService.getUsersRegisteredAfter(date).isEmpty()){
                    return ResponseEntity.status(400).body(new ApiResponse("There is no users registered after the given date yet in the DataBase to show their information !"));
                }

                return ResponseEntity.status(200).body(userService.getUsersRegisteredAfter(date));
            }

}
