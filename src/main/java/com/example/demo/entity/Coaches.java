package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "coaches")
public class Coaches{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String full_name;

    private String contact_information;

    private String login;
    private String information;
}
