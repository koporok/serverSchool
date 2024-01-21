package com.example.demo.server;

import com.example.demo.dto.StudentRequest;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentServer {

    @Autowired
    private StudentRepository studentRepository;
    public ResponseEntity<List<Student>> ReturnData(@RequestBody StudentRequest student){
        List<Student> all = studentRepository.findAll();
        return ResponseEntity.ok(all);

    }
}

