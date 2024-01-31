package com.example.demo.controller;

import com.example.demo.dto.CoachesRequest;
import com.example.demo.dto.StudentRequest;
import com.example.demo.entity.Coaches;
import com.example.demo.entity.Student;
import com.example.demo.repository.CoachesRepository;
import com.example.demo.server.CoachesServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coaches")
public class CoachesController {

    @Autowired
    private CoachesRepository coachesRepository;

    @Autowired
    private CoachesServer coachesServer;

    @GetMapping("/") // получение данных
    public List<Coaches> getAllStudents() {return coachesServer.getAllCoaches();}

    @PostMapping("/")
    public ResponseEntity<?> add(@RequestBody CoachesRequest сoaches) {
        ResponseEntity<List<Coaches>> responseData = coachesServer.returnAllCoaches();
        return responseData;
    }
    @DeleteMapping("/{id}") // удаление
    public ResponseEntity<Coaches> deleteCoaches(@PathVariable Long id) {
        ResponseEntity<Coaches> responseData = coachesServer.deleteCoachesById(id);
        return responseData;
    }

    @PostMapping("/add") // добавление тренера
    public ResponseEntity<Coaches> addCoaches(@RequestBody Coaches сoachesDTO) {
        ResponseEntity<Coaches> responseData = coachesServer.addCoachesToDatabase(сoachesDTO);
        return responseData;
    }
}

