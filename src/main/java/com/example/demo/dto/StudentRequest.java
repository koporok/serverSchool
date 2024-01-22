package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Builder
@Getter
public class StudentRequest{
    private String fullName;
    private String name;
    private Date dateOfBirth;

    private String contactInformation;

    private Long groupId;

    private String sportType;

    private String login;
}
/*
@Builder
@Getter
public class StudentResponse {
    private String fullName;
    private String name;
}*/