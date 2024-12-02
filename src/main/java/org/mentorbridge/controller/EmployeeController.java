package org.mentorbridge.controller;

import org.mentorbridge.dto.Employee;
import org.mentorbridge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling employee-related operations.
 * Allows clients to perform operations such as adding new employees.
 *
 * Annotations:
 * - @RestController: Indicates that this class is a REST controller and
 *   will handle HTTP requests.
 * - @Autowired: Marks a field to be auto-wired by Spring's dependency
 *   injection facilities.
 *
 * Operations:
 * - addEmployee: Accepts a POST request to add a new employee to the
 *   system.
 */
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        System.out.println("Employee added: " + employee);
        return employeeService.addEmployee(employee);
    }
}
