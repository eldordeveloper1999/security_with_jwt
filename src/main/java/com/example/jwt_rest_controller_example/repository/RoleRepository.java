package com.example.jwt_rest_controller_example.repository;

import com.example.jwt_rest_controller_example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
