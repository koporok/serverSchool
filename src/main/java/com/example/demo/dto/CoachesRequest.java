package com.example.demo.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CoachesRequest {
    private String full_name;

    private String contact_information;

    private String login;
}
