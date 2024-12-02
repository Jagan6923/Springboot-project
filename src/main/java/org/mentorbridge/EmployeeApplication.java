package org.mentorbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The EmployeeApplication class serves as the entry point for the Spring Boot application.
 * It initializes and launches the application using the SpringApplication. Run method.
 * This class is annotated with @SpringBootApplication, which indicates it is a Spring Boot application
 * and triggers the autoconfiguration, component scanning, and other bootstrapping features.
 */
@SpringBootApplication
public class EmployeeApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);

	}
}
