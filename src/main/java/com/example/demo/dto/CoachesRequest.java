package com.example.demo.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CoachesRequest {


    private String FullName;

    private String ContactInfo;

    private String Login;
    private String Information;
}

