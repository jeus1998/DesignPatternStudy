package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._01_inheritance;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.gameService1();
        gameService.gameService2();
    }
}
