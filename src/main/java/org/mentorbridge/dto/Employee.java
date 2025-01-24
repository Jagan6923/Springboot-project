package org.mentorbridge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Represents an employee with various personal and contact details.
 * This class is utilized for data transfer and manipulation of employee
 * information within the system.
 *
 * Lombok Annotations:
 * - @Data: Generates boilerplate code such as getters, setters, equals, hash, and toString methods.
 * - @AllArgsConstructor: Generates a constructor requiring all declared fields as parameters.
 * - @Builder: Provides a pattern for constructing instances of this class.
 *
 */
@Data
@AllArgsConstructor
@Builder
public class Employee {
    private long empId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address; // Ensure this field exists

}
