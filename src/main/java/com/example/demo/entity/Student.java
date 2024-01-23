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
@Table(name = "students")
public class Student {

  @Id //индификатор
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String fullName;

  //@Column(name = "version_date", nullable = false, columnDefinition = "TIMESTAMP")
  private Date dateOfBirth;

  private String contactInformation;

  private Long groupId; // Unique group identifier

  private String sportType;

  private String login;
}
