package com.example.mainpkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.rbac.repository") // Ensure repositories are scanned
@EntityScan("com.example.rbac.model") // Ensure entities are scanned
public class RbacSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacSystemApplication.class, args);
	}

}
