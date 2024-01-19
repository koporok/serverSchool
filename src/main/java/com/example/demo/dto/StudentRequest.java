package com.example.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Builder
@Getter
public class StudentRequest {
    private String fullName;
    private String name;
}
/*
@Builder
@Getter
public class StudentResponse {
    private String fullName;
    private String name;
}*/