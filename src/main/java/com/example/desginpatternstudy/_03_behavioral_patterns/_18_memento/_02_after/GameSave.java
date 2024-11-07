package com.example.desginpatternstudy._03_behavioral_patterns._18_memento._02_after;

import lombok.Getter;

/**
 * 메멘토
 * 메멘토에서 가지는 상태값은 외부에서 변경이 불가능 하도록 Immutable 하게 만든다.
 */
@Getter
public final class GameSave {
    private final int blueTeamScore;
    private final int redTeamScore;
    public GameSave(int blueTeamScore, int redTeamScore){
        this.blueTeamScore = blueTeamScore;
        this.redTeamScore = redTeamScore;
    }
}
