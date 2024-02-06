package com.example.demo.controller;

import com.example.demo.entity.Groups;
import com.example.demo.repository.GroupsRepository;
import com.example.demo.server.GroupsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupsController {
    @Autowired
    private GroupsRepository groupsRepository;

    @Autowired
    private GroupsServer groupsServer;
    @PostMapping("/")
    public ResponseEntity<?> add(@RequestBody Groups groups) {

        ResponseEntity<List<Groups>> responseData = groupsServer.ReturnData(groups);

        return responseData;
    }
}
