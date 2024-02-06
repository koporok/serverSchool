package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class StudentRequest{
    private String fullname;

    private String dateofbirth;

    private String contactinfo;

    private Long groupid;

    private String sporttype;

    private String login;


}
