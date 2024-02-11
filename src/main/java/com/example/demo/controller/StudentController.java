package com.example.demo.controller;

import com.example.demo.dto.StudentRequest;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServer studentServer;

    @Autowired
    public StudentController(StudentServer studentServer) {
        this.studentServer = studentServer;
    }

    @PostMapping("/add") // добавление студента
    public ResponseEntity<String> addStudent(@RequestBody StudentRequest studentDTO) {
        ResponseEntity<String> responseData = studentServer.addStudentToDatabase(studentDTO);
        return responseData;
    }

    @GetMapping("/") // получение данных
    public List<Student> getAllStudents() {return studentServer.getAllStudents();
    }

    @PostMapping("/") // получение данных
    public ResponseEntity<?> add(@RequestBody StudentRequest student) {
        ResponseEntity<List<Student>> responseData = studentServer.ReturnData(student);
        return responseData;
    }

    @DeleteMapping("/{id}") // удаление
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        ResponseEntity<String> responseData = studentServer.deleteStudentById(id);
        return responseData;
    }

    @PostMapping("/{id}")//обновление данных одного студента
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Student updated = studentServer.updateStudent(id, updatedStudent);
        if(updated != null) {
            return ResponseEntity.ok("Данные студента с ID " + id + " успешно обновлены");
        } else {
            return ResponseEntity.notFound().build(); // Обработка случая, когда студент не найден
        }
    }

    @GetMapping("/user/{login}")
    public Student getStudentByLogin(@PathVariable String login) {
        return studentServer.getStudentByLogin(login);
    }
}
