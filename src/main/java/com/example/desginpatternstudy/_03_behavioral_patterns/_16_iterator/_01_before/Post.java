package com.example.desginpatternstudy._03_behavioral_patterns._16_iterator._01_before;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class Post {
    private String title;
    private final LocalDateTime createdDateTime;
    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }
}
