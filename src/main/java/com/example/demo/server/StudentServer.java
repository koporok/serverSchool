package com.example.demo.server;

import com.example.demo.dto.StudentRequest;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
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

    public ResponseEntity<String> addStudentToDatabase(@RequestBody StudentRequest studentDTO) {
        try {
            Student student = new Student();
            student.setFullName(studentDTO.getFullName());
            student.setDateOfBirth(studentDTO.getDateOfBirth());
            student.setContactInformation(studentDTO.getContactInformation());
            student.setSportType(studentDTO.getSportType());

            studentRepository.save(student);

            return new ResponseEntity<>("Студент успешно добавлен в базу данных", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Произошла ошибка при добавлении студента: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<String> deleteStudentById(@PathVariable Long id) {
        try {
            if (studentRepository.existsById(id)) {
                studentRepository.deleteById(id); // удаляем студента из базы данных по Id
                return new ResponseEntity<>("Студент с Id " + id + " успешно удален из базы данных", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Студент с Id " + id + " не найден", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Произошла ошибка при удалении студента: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

