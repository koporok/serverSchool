package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity // Сущность, для хранения в базе данных
@Getter
@Setter
@NoArgsConstructor
@Table(name = "coaches")
public class Coaches{

    @Id //индификатор
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String full_name;

    private String contact_information;

    private String login;
}
