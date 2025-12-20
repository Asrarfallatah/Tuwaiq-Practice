package org.example.usersystem.Controller;


import jakarta.validation.Valid;
import org.example.usersystem.ApiResponse.ApiResponse;
import org.example.usersystem.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {


    ArrayList<User> users = new ArrayList<>();

    //display all
    @GetMapping("/get")
    public  ArrayList<User> getUsers(){
        return users;
    }

    //add user
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody @Valid User user, Errors errors){

        if (errors.hasErrors()){
             String message = errors.getFieldError().getDefaultMessage();
             return ResponseEntity.status(400).body(new ApiResponse(message));
             // OR another way :    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(message));
        }

        users.add(user);
        return ResponseEntity.status(200).body(new ApiResponse("user information has been added Successfully "));

    }

    //edit user
    @PutMapping("/update/{index}")
    public ResponseEntity<?> updateUser (@PathVariable int index , @RequestBody @Valid User user, Errors errors){

       if(errors.hasErrors()){
           String message = errors.getFieldError().getDefaultMessage();
           return ResponseEntity.status(400).body(new ApiResponse(message));
       }

        users.set(index, user);
        return ResponseEntity.status(200).body(new ApiResponse("user information has been updated Successfully "));
    }


    //delete user
    @DeleteMapping("/delete/{index}")
    public ResponseEntity<?> deleteUser(@PathVariable  int index){
        users.remove(index);
        return ResponseEntity.status(200).body(new ApiResponse("user information has been deleted Successfully "));

    }


    //check Age
    @GetMapping("/get-age/{age}")
    public ResponseEntity<?>  getByAge (@PathVariable int age ){

        ArrayList <User> users1 = new ArrayList<>();

        for (User user : users){

            if (user.getAge() == age ){
                users1.add(user);
            }

        }
        if (users1.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse("there is no user with the given age"));
        }
        return ResponseEntity.status(200).body(users1);
    }

    //check range
    @GetMapping("/get-age/{minAge}/{maxAge}")
    public ResponseEntity<?>  getByRange (@PathVariable int minAge , @PathVariable int maxAge ){

        ArrayList <User> users1 = new ArrayList<>();

        for (User user : users){

            if (  user.getAge() >= minAge &&  user.getAge() <= maxAge  ){
                users1.add(user);
            }

        }

        if (users1.isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("there is no users within the given range"));
        }

        return ResponseEntity.status(200).body(users1);

    }


    //get users names who is Passwords is really strong
    @GetMapping("/get/{level}")
    public ResponseEntity<?>  getByPassword( @PathVariable String level) {

        ArrayList<User> usersStrong = new ArrayList<>();
        ArrayList<User> usersMid = new ArrayList<>();
        ArrayList<User> usersWeak = new ArrayList<>();

        for (User user : users) {

            if (user.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$")) {
                usersStrong.add(user);
            } else if (user.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$")) {
                usersMid.add(user);
            } else if (user.getPassword().matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$")) {
                usersWeak.add(user);
            }

        }

        if (level.equalsIgnoreCase("strong")) {

            return ResponseEntity.status(200).body(usersStrong);

        } else if (level.equalsIgnoreCase("mid")) {

            return ResponseEntity.status(200).body(usersMid);

        } else if (level.equalsIgnoreCase("weak")) {

            return ResponseEntity.status(200).body(usersWeak);

        }
            return ResponseEntity.status(400).body("Error you did not enter the Strength level correctly ");

    }



}
