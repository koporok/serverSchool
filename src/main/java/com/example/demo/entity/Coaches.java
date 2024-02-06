package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Coaches")
public class Coaches{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer coachesid;

    private String fullname;

    private String contactinfo;

    private String login;
    private String information;
}
