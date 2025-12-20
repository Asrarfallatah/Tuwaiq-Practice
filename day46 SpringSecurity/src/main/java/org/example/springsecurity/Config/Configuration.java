package org.example.springsecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@org.springframework.context.annotation.Configuration
@EnableWebSecurity
public class Configuration {

    // this method to change the default username and password
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        return http

                // disable csrf this to allow sending requests
                .csrf(csrf -> csrf.disable())

                // this is for session management when to auto logout but my account info still saved in the session
                .sessionManagement(sm -> sm
                        .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                )

                // this is for authorization like which api need authentication and who enter the path link
                .authorizeHttpRequests(auth -> auth

                        // you can access these api without authentication because of ** after /api/v1/auth/
                        // to be specific you need to add all  api under /api/v1/auth/endpointName
                        // you can not add ** and then replace it with specific endpoint
                        .requestMatchers("/api/v1/auth/register").permitAll()

                        // only users with USER authority can access these api
                        .requestMatchers("/api/v1/todo/get-my-todos",
                                         "/api/v1/todo/add",
                                         "/api/v1/todo/update/{toDoId}",
                                     "/api/v1/todo/delete/{toDoId}")
                                        .hasAuthority("USER")


                        .anyRequest().authenticated()
                )

                // log out of my account and delete the session and all cookies is deleted
                .logout( logout -> logout
                        .logoutUrl("/api/v1/auth/logout")
                        .deleteCookies("JSESSIONID")
                        .invalidateHttpSession(true)
                )

                .httpBasic(basic -> {})

                .build();

    }
}
