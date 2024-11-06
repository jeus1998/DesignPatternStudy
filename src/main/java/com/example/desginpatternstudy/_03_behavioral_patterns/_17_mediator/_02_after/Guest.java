package com.example.desginpatternstudy._03_behavioral_patterns._17_mediator._02_after;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Guest {
    private Integer id;
    private FrontDesk frontDesk = new FrontDesk();
    public void getTowers(int numberOfTowers){
        frontDesk.getTowers(this, numberOfTowers);
    }
    public void dinner(LocalDateTime dateTime){
        this.frontDesk.dinner(this, dateTime);
    }
}
