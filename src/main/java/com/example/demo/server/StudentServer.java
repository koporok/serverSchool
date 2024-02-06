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


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServer {

    @Autowired
    private StudentRepository studentRepository;


    public void StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public ResponseEntity<List<Student>> ReturnData(@RequestBody StudentRequest student){
        List<Student> all = studentRepository.findAll();
        return ResponseEntity.ok(all);

    }

    public ResponseEntity<String> addStudentToDatabase(@RequestBody StudentRequest studentDTO) {
        try {
            Student student = new Student();
            student.setFullname(studentDTO.getFullname());
            student.setDateofbirth(studentDTO.getDateofbirth());
            student.setContactinfo(studentDTO.getContactinfo());
            student.setSporttype(studentDTO.getSporttype());

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

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);

        if(existingStudent != null) {
            existingStudent.setFullname(updatedStudent.getFullname());
            existingStudent.setDateofbirth(updatedStudent.getDateofbirth());
            existingStudent.setContactinfo(updatedStudent.getContactinfo());
            existingStudent.setGroupid(updatedStudent.getGroupid());
            existingStudent.setSporttype(updatedStudent.getSporttype());
            existingStudent.setLogin(updatedStudent.getLogin());

            return studentRepository.save(existingStudent);
        } else {
            // Обработка случая, когда студент с указанным ID не найден
            return null;
        }
    }

    public Student getStudentByLogin(String login) {
        List<Student> students = studentRepository.findAllByLogin(login);
        if (!students.isEmpty()) {
            return students.get(0);
        } else {
            return null;
        }
    }

}

