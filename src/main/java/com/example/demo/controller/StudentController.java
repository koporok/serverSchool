package com.example.demo.controller;

import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    public StudentController(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

/*

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping(path="/{id}")
    public Student findById(@PathVariable Long id){
        return studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }*/
}
