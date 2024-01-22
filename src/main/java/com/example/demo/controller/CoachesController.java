package com.example.demo.controller;

import com.example.demo.dto.CoachesRequest;
import com.example.demo.entity.Coaches;
import com.example.demo.repository.CoachesRepository;
import com.example.demo.server.CoachesServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CoachesController {

    @Autowired
    private CoachesRepository coachesRepository;

    @Autowired
    private CoachesServer coachesServer;
    @PostMapping("/coaches")
    public ResponseEntity<?> add(@RequestBody CoachesRequest сoaches) {

        ResponseEntity<List<Coaches>> responseData = coachesServer.ReturnData(сoaches);

        return responseData;
    }
}

