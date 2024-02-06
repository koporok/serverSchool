package com.example.demo.repository;

import com.example.demo.entity.Schedule;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findAllByLessondate(Date lessondate);
}
