package org.mentorbridge.service;

import org.mentorbridge.dto.Employee;
import org.mentorbridge.entity.EmployeeEntity;
import org.mentorbridge.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for handling operations related to employees.
 * It provides functionality to add new employees to the system by
 * interacting with the EmployeeRepository.
 *
 * Annotations:
 * - @Service: Marks this class as a service component in Spring's
 *   context, facilitating dependency injection.
 * - @Autowired: Injects the EmployeeRepository instance automatically
 *   into this service class.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .phone(employee.getPhone())
                .address(employee.getAddress()) // Set the address here
                .role("Developer") // Default role
                .build();

        EmployeeEntity savedEntity = employeeRepository.save(employeeEntity);

        return Employee.builder()
                .empId(savedEntity.getId())
                .firstName(savedEntity.getFirstName())
                .lastName(savedEntity.getLastName())
                .email(savedEntity.getEmail())
                .phone(savedEntity.getPhone())
                .address(savedEntity.getAddress()) // Return the address
                .build();
    }

}
