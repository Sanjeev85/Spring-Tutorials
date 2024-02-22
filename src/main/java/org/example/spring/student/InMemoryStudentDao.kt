package org.example.spring.student

import org.springframework.stereotype.Repository
import java.time.LocalDate


@Repository
class InMemoryStudentDao {

    private val STUDENTS = ArrayList<Student>()

    fun findAllStudents(): List<Student> {
        return this.STUDENTS
    }

    fun save(s: Student?): Student {
        val currentStudent = Student(
            s?.firstname, s?.lastname, LocalDate.now(), s?.email
        )
        this.STUDENTS.add(currentStudent)
        return currentStudent
    }

    fun findByEmail(email: String?): Student? {
        return STUDENTS.find { it.email == email }
    }

    fun delete(email: String?) {
        val student = findByEmail(email)
        student?.let { STUDENTS.remove(it) }
    }

    fun update(s: Student?): Student {
        val startIndex = STUDENTS.indexOfFirst { it.email == s?.email }
        if (startIndex != -1) {
            STUDENTS[startIndex] = s!!
        }
        return s!!
    }
}