package org.example.spring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Sanjeev",
                        "Choubey",
                        LocalDate.now(),
                        "contact@email.com"
                ),
                new Student("Sanjeev",
                        "Choubey",
                        LocalDate.now(),
                        "contact@email.com"
                )
        );
    }
}
