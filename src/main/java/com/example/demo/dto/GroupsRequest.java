package com.example.demo.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
public class GroupsRequest {
    private String group_name;

    //@Column(name = "version_date", nullable = false, columnDefinition = "TIMESTAMP")
    private String sport_type  ;

    private String age_group;

    private Integer max_students; // Unique group identifier

    private Integer coach_id;
}
