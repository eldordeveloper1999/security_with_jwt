package com.example.jwt_rest_controller_example.service;

import com.example.jwt_rest_controller_example.model.Role;
import com.example.jwt_rest_controller_example.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
