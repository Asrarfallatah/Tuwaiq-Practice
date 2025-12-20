package org.example.springsecurity.Service;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.Model.User;
import org.example.springsecurity.Repository.AuthRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository authRepository;

    public void register (User user){

        user.setRole("USER");
        String hashedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(hashedPassword);
        authRepository.save(user);

    }
}
