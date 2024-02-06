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
@Table(name = "Students")
public class Student {

  @Id //индификатор
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer studentid;

  private String fullname;

  private String dateofbirth;

  private String contactinfo;

  private int groupid;

  private String sporttype;

  private String login;


}
