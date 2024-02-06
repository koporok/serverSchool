package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Сущность, для хранения в базе данных
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Attendance")
public class Attendance {

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer attendanceid;

    private int studentid;

    private int lessonid;

    private Boolean presenceflag;


}
