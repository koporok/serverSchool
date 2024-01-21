package com.example.demo.controller;

import com.example.demo.dto.StudentRequest;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.server.StudentServer;

import java.util.List;

@RestController
@RequestMapping("/students") // добавим мэппинг для всех методов в контроллере

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentServer studentServer;

    @RequestMapping("/greet")
    @GetMapping
    public String greeting() {
        return "Хранение данных детской школы единоборств";
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {

        //Iterator<Student> students = (Iterator<Student>) studentRepository.findAll(); // получаем список всех студентов
//        model.put("students", students); // помещаем список студентов в модель
       // return "fff" ; // возвращаем имя представления (шаблона), которое будет отображать список студентов
        List<Student> all = studentRepository.findAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping("/save")
    public ResponseEntity<?> add(@RequestBody StudentRequest student){

        ResponseEntity<List<Student>> responseData = studentServer.ReturnData(student);

        return responseData;
       //SudentService;
        //ss.save(StudentRequest)
        //Student build = new Student();
        //build.setFullName(student.getFullName());
        //studentRepository.save(build);

        //List<Student> all = studentRepository.findAll();
        //return ResponseEntity.ok(all);

    }


}
