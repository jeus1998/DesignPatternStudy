package com.example.desginpatternstudy._03_behavioral_patterns._18_memento._01_before;
public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(10);

        // 정보 은닉 실패
        // 클라이언트가 Game 객체에 대한 구체적인 정보에 의존을 한다.
        // 만약 현재는 2개의 상태만 존재하지만 상태가 늘어나거나 상태 자체에 대한 변경이 일어난다면?
        // -> 클라이언트는 변경이 일어난다.
        int redTeamScore = game.getRedTeamScore();
        int blueTeamScore = game.getBlueTeamScore();

        Game reStartGame = new Game();
        reStartGame.setRedTeamScore(redTeamScore);
        reStartGame.setBlueTeamScore(blueTeamScore);
    }
}
