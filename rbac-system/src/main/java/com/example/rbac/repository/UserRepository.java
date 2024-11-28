package com.example.rbac.repository;

import com.example.rbac.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can go here, for example:
    User findByUsername(String username);
}
