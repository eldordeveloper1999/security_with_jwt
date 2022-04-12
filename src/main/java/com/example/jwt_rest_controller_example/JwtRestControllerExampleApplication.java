package com.example.jwt_rest_controller_example;


import com.example.jwt_rest_controller_example.model.Role;
import com.example.jwt_rest_controller_example.model.User;
import com.example.jwt_rest_controller_example.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JwtRestControllerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtRestControllerExampleApplication.class, args);
    }


    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Phil Jones", "phil", "1", new ArrayList<>()));
            userService.saveUser(new User(null, "Diogo Dalot", "diogo", "2", new ArrayList<>()));
            userService.saveUser(new User(null, "Dean Huges", "dean", "3", new ArrayList<>()));
            userService.saveUser(new User(null, "Jim Carry", "jim", "4", new ArrayList<>()));

            userService.addRoleToUser("phil", "ROLE_USER");
            userService.addRoleToUser("phil", "ROLE_MANAGER");
            userService.addRoleToUser("diogo", "ROLE_MANAGER");
            userService.addRoleToUser("diogo", "ROLE_ADMIN");
            userService.addRoleToUser("dean", "ROLE_USER");
            userService.addRoleToUser("dean", "ROLE_ADMIN");
            userService.addRoleToUser("jim", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("jim", "ROLE_ADMIN");
            userService.addRoleToUser("jim", "ROLE_MANAGER");
        };
    }
}
