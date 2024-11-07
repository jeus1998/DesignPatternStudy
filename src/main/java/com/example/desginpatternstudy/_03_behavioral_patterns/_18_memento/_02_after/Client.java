package com.example.desginpatternstudy._03_behavioral_patterns._18_memento._02_after;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave save = game.save();

        game.setRedTeamScore(100);
        game.setBlueTeamScore(10);

        game.restore(save);
        System.out.println(game.getBlueTeamScore()); // 20
        System.out.println(game.getRedTeamScore());  // 10
    }
}
