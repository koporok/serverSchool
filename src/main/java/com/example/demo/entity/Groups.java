package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.util.Date;
import java.util.List;

@Entity // Сущность, для хранения в базе данных
@Getter
@Setter
@NoArgsConstructor
@Table(name = "groups")
public class Groups {

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer groupid;

    private String groupname;

    private String sporttype;

    @Column
    private String aage;


    private int maxstudents;

    @Column
    private int coachesid;



}
