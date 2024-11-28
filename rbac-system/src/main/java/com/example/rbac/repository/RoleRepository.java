package com.example.rbac.repository;

import com.example.rbac.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Custom query methods can go here, for example:
    Role findByName(String name);
}