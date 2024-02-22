package org.example.spring.student

import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class InMemoryStudentService(val dao: InMemoryStudentDao) : StudentService {

    override fun findAllStudents(): List<Student>? {
        return dao.findAllStudents()
    }

    override fun save(s: Student?): Student {
        return dao.save(s)
    }

    override fun findByEmail(email: String?): Student {
        return dao.findByEmail(email)!!
    }

    override fun delete(email: String?) {
        return dao.delete(email)
    }

    override fun update(s: Student?): Student {
        return dao.update(s)
    }
}