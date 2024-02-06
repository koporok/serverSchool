package com.example.demo.repository;

import com.example.demo.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupsRepository extends JpaRepository<Groups, Long> {
}

