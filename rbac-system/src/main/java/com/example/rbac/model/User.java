package com.example.rbac.model;

import jakarta.persistence.Entity;  // Use jakarta.persistence
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data // Lombok generates getters, setters, toString, equals, and hashCode methods
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
