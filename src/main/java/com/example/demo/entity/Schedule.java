package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity // Сущность, для хранения в базе данных
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Schedule")
public class Schedule {

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lessonid;

    private int groupid;

    private Date lessondate;

    private String time;

    private int coachesid;

}
