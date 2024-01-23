package com.example.demo.server;

import com.example.demo.dto.AttendanceRequest;
import com.example.demo.entity.Attendance;
import com.example.demo.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AttendanceServer{

    @Autowired
    private AttendanceRepository attendanceRepository;
    public ResponseEntity<List<Attendance>> ReturnData(@RequestBody AttendanceRequest attendance){
        List<Attendance> all = attendanceRepository.findAll();
        return ResponseEntity.ok(all);

    }
}

