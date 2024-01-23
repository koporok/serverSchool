package com.example.demo.controller;

import com.example.demo.dto.StudentRequest;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.server.StudentServer;

import java.util.List;

@RestController
@RequestMapping

public class StudentController {

    @Autowired
    private StudentRepository studentRepository; // предположим, что у вас есть StudentRepository для взаимодействия с базой данных

    @Autowired
    private StudentServer studentServer;

    @PostMapping("/add_students")
    public ResponseEntity<String> addStudent(@RequestBody StudentRequest studentDTO) {

        ResponseEntity<String> responseData = studentServer.addStudentToDatabase(studentDTO);

        return responseData;

    }
    @PostMapping("/students")
        public ResponseEntity<?> add(@RequestBody StudentRequest student) {

            ResponseEntity<List<Student>> responseData = studentServer.ReturnData(student);

            return responseData;
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        ResponseEntity<String> responseData = studentServer.deleteStudentById(id);

        return responseData;

    }
}
