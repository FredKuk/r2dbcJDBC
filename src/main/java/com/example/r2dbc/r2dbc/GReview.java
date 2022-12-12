package com.example.r2dbc.r2dbc;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Table(name = "gReview")
public class GReview{
    @Id
    Long gReviewNo;
    int goodNo;
    int cusNo;
    String subject;
    String contents;
    LocalDateTime startDate;
    LocalDateTime changeDate;
    int stat;
}