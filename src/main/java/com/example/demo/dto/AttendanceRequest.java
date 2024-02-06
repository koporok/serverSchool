package com.example.demo.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AttendanceRequest {


    private Integer StudentID;

    private Integer LessonID;

    private Boolean PresenceFlag;
}
