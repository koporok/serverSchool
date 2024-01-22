package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter

public class ScheduleRequest {
    private Integer group_id;

    private Date lesson_date;

    private String time;

    private Integer coach_id;
}
