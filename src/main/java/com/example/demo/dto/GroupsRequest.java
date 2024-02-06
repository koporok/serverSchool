package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GroupsRequest {
    private String GroupName;

    private String SportType;

    private String Aage;

    private Integer max_students;
    private Integer TrainerID;
}
