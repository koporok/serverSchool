package com.example.demo.repository;

import com.example.demo.entity.Coaches;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoachesRepository  extends JpaRepository<Coaches, Long> {
}