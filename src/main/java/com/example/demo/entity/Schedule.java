package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity // Сущность, для хранения в базе данных
@Getter
@Setter
//@Builder
//@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schedule")
public class Schedule {

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer group_id;

    private Date lesson_date;

    private String time;

    private Integer coach_id;

}