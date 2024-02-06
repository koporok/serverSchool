package com.example.demo.controller;

import com.example.demo.entity.Groups;
import com.example.demo.repository.GroupsRepository;
import com.example.demo.server.GroupsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupsController {
    @Autowired
    private GroupsRepository groupsRepository;

    @Autowired
    private GroupsServer groupsServer;

    @PostMapping("/")
    public ResponseEntity<?> addPost(@RequestBody Groups groups) {

        ResponseEntity<List<Groups>> responseData = groupsServer.ReturnData(groups);

        return responseData;
    }

    @GetMapping("/")
    public ResponseEntity<List<Groups>> getGroups() {
        return groupsServer.returnData();
    }
}
