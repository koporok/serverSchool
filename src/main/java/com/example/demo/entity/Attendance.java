package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Сущность, для хранения в базе данных
@Getter
@Setter
@NoArgsConstructor
@Table(name = "attendance")
public class Attendance {

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer attendance_id;

    private Integer student_id;

    private Integer lesson_id;

    private String login;

    private Boolean attendanceFlag;
}
