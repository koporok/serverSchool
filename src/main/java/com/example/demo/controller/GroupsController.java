package com.example.demo.controller;

import com.example.demo.entity.Groups;
import com.example.demo.entity.Student;
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

    @PostMapping("/{id}")//обновление данных одного студента
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @RequestBody Groups updatedGroups) {
        Groups updated = groupsServer.updateGroups(id, updatedGroups);
        if(updated != null) {
            return ResponseEntity.ok("Данные студента с ID " + id + " успешно обновлены");
        } else {
            return ResponseEntity.notFound().build(); // Обработка случая, когда студент не найден
        }
    }

}
