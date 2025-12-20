package org.example.bankingmanagementsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiException;
import org.example.bankingmanagementsystem.Model.User;
import org.example.bankingmanagementsystem.Repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    // register
    public void register(User user) {

        if (!user.getRole().matches("CUSTOMER|EMPLOYEE|ADMIN")) {
            throw new ApiException("Invalid role");
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new ApiException("Password cannot be empty");
        }


        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        userRepository.save(user);
    }

    // authentication
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findUserByUsername(username);
        if (user == null) {
            throw new ApiException("Wrong username or password");
        }
        return user;
    }

    // get all
    public List<User> getAllUsers() {
        if (userRepository.findAll().isEmpty()) {
            throw new ApiException("No users found yet");
        }
        return userRepository.findAll();
    }

    // update
    public void updateUser(Integer id, User user) {
        User existingUser = userRepository.findUserById(id);
        if (existingUser == null) {
            throw new ApiException("User not found");
        }

        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(
                new BCryptPasswordEncoder().encode(user.getPassword())
        );
        existingUser.setRole(user.getRole());

        userRepository.save(existingUser);
    }

    // delete
    public void deleteUser(Integer id) {
        User existingUser = userRepository.findUserById(id);
        if (existingUser == null) {
            throw new ApiException("User not found");
        }
        userRepository.delete(existingUser);
    }
}
