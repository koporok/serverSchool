package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter

public class ScheduleRequest {
    private Integer GroupID;

    private Date LessonDate;

    private String Time;

    private Integer TrainerID;
}
