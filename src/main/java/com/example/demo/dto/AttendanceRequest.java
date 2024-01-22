package com.example.demo.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AttendanceRequest {
    private Integer student_id;

    private Integer lesson_id;

    private String login;

    private Boolean attendanceFlag;
}
