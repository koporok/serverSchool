package com.example.demo.server;

import com.example.demo.dto.ScheduleRequest;
import com.example.demo.entity.Schedule;
import com.example.demo.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ScheduleServer {
    @Autowired
    private ScheduleRepository scheduleRepository;
    public ResponseEntity<List<Schedule>> ReturnData(@RequestBody ScheduleRequest schedule){
        List<Schedule> all = scheduleRepository.findAll();
        return ResponseEntity.ok(all);

    }
}
