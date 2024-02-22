package org.example.spring.student;

import java.time.LocalDate;

public record Student(String firstname, String lastname, LocalDate dateOfBirth, String email) {
}
