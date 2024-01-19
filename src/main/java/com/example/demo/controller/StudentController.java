package com.example.demo.controller;

import com.example.demo.dto.StudentRequest;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students") // добавим мэппинг для всех методов в контроллере

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/greet")
    @GetMapping
    public String greeting() {
        return "Хранение данных детской школы единоборств";
    }

    @GetMapping("/all")
    public String getAllStudents() {
        Iterator<Student> students = (Iterator<Student>) studentRepository.findAll(); // получаем список всех студентов
//        model.put("students", students); // помещаем список студентов в модель
        return "fff" ; // возвращаем имя представления (шаблона), которое будет отображать список студентов
    }

    @PostMapping("/save")
    public ResponseEntity<?> add(@RequestBody StudentRequest student){
        //SudentService;
        //ss.save(StudentRequest)
        Student build = new Student();
        build.setFullName(student.getFullName());
        studentRepository.save(build);

        List<Student> all = studentRepository.findAll();
        return ResponseEntity.ok(all);
    }

}
