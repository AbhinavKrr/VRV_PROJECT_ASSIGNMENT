package com.example.rbac.repository;

import com.example.rbac.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    // Custom query to find a role by name
    Optional<Role> findByName(String name);

    // Check if a role exists by name
    boolean existsByName(String name);
}
