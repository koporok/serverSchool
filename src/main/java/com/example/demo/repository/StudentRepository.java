package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

@Repository
public class StudentRepository {

    private final DatabaseClient databaseClient;

    @Autowired
    public StudentRepository(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    public Flux<Student> findAllStudents() {
        return databaseClient.execute("SELECT * FROM students")
                .as(Student.class)
                .fetch()
                .all();
    }

    public Mono<Student> findStudentById(Integer id) {
        return databaseClient.execute("SELECT * FROM students WHERE id = :id")
                .bind("id", id)
                .as(Student.class)
                .fetch()
                .one();
    }

    public Mono<Map<String, Object>> saveStudent(Student student) {
        return databaseClient.insert()
                .into(Student.class)
                .table("students")
                .using(student)
                .fetch()
                .one();
    }

    public Mono<Void> deleteStudent(Integer id) {
        return databaseClient.execute("DELETE FROM students WHERE id = :id")
                .bind("id", id)
                .fetch()
                .rowsUpdated()
                .then();
    }
}
*/