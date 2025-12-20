package org.example.springsecurity.Service;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.Api.ApiException;
import org.example.springsecurity.Model.User;
import org.example.springsecurity.Repository.AuthRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final AuthRepository authRepository;

    // this is to check the username from database
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // check if the user exists in the database with correct information
        User user = authRepository.findUserByUsername(username);
        if (user == null){
            throw new ApiException("wrong username or password");
        }
        return  user;
    }


}
