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
@Table(name = "groups")
public class Groups {

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer group_id;

    private String group_name;

    private String sport_type;

    private String age_group;

    private int max_students;

    private Integer coach_id;

}
