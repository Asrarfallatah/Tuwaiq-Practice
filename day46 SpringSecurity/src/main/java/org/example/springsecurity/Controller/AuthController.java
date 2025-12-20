package org.example.springsecurity.Controller;


import lombok.RequiredArgsConstructor;
import org.example.springsecurity.Api.ApiResponse;
import org.example.springsecurity.Model.User;
import org.example.springsecurity.Service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register (@RequestBody User user){
        authService.register(user);
        return ResponseEntity.status(200).body(new ApiResponse("User registered!"));
    }

}
