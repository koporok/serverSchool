package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GroupsRequest {
    private String group_name;

    private String sport_type  ;

    private String age_group;

    private Integer max_students;

    private Integer coach_id;
}
