package com.example.demo.controller;

import com.example.demo.dto.AttendanceRequest;
import com.example.demo.entity.Attendance;
import com.example.demo.repository.AttendanceRepository;
import com.example.demo.server.AttendanceServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AttendanceController {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private AttendanceServer attendanceServer;
    @PostMapping("/attendance")
    public ResponseEntity<?> add(@RequestBody AttendanceRequest attendance) {

        ResponseEntity<List<Attendance>> responseData = attendanceServer.ReturnData(attendance);

        return responseData;
    }
}

