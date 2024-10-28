package com.example.desginpatternstudy._02_structural_patterns._10_facade._02_after;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class EmailMessage {
    private String to;
    private String from;
    private String subject;
    private String text;
}
