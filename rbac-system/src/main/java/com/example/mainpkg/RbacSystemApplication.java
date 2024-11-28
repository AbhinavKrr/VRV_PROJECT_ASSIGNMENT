package com.example.mainpkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.rbac.repository")
public class RbacSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbacSystemApplication.class, args);
	}

}
