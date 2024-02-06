package com.example.demo.controller;

import com.example.demo.dto.ScheduleRequest;
import com.example.demo.entity.Schedule;
import com.example.demo.repository.ScheduleRepository;
import com.example.demo.server.ScheduleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private ScheduleServer scheduleServer;
    @PostMapping("/")
    public ResponseEntity<?> addPost(@RequestBody ScheduleRequest schedule) {

        ResponseEntity<List<Schedule>> responseData = scheduleServer.ReturnData(schedule);

        return responseData;
    }
    @GetMapping("/")
    public ResponseEntity<?> addGet(@RequestBody ScheduleRequest schedule) {

        ResponseEntity<List<Schedule>> responseData = scheduleServer.ReturnData(schedule);

        return responseData;
    }

    @GetMapping("/date/{lessondate}")
    public Schedule getCoachesByLogin(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date lessondate) {
        return scheduleServer.getStudentByDate(lessondate);
    }

}
