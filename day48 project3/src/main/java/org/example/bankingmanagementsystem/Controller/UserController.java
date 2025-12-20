package org.example.bankingmanagementsystem.Controller;

import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiResponse;
import org.example.bankingmanagementsystem.Model.User;
import org.example.bankingmanagementsystem.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // get
    @GetMapping("/get")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // add
    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@RequestBody User user) {
        userService.register(user);
        return ResponseEntity.status(200).body(new ApiResponse("User registered successfully"));
    }

    // update
    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponse> updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(id, user);
        return ResponseEntity.ok(new ApiResponse("User updated successfully"));
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.ok(new ApiResponse("User deleted successfully"));
    }
}
