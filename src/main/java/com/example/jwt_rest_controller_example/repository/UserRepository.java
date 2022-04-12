package com.example.jwt_rest_controller_example.repository;

import com.example.jwt_rest_controller_example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
