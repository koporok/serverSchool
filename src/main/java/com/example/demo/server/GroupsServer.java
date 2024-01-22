package com.example.demo.server;

import com.example.demo.dto.GroupsRequest;
import com.example.demo.dto.ScheduleRequest;
import com.example.demo.entity.Groups;
import com.example.demo.entity.Schedule;
import com.example.demo.repository.GroupsRepository;
import com.example.demo.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class GroupsServer {

    @Autowired
    private GroupsRepository groupsRepository;
    public ResponseEntity<List<Groups>> ReturnData(@RequestBody GroupsRequest groups){
        List<Groups> all = groupsRepository.findAll();
        return ResponseEntity.ok(all);

    }
}
