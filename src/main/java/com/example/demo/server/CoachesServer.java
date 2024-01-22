package com.example.demo.server;

import com.example.demo.dto.CoachesRequest;
import com.example.demo.entity.Coaches;
import com.example.demo.repository.CoachesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CoachesServer {
    @Autowired
    private CoachesRepository coachesRepository;

    public ResponseEntity<List<Coaches>> ReturnData(@RequestBody CoachesRequest coaches){
        List<Coaches> all = coachesRepository.findAll();
        return ResponseEntity.ok(all);
    }

}
