package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._02_interface;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy(new DefaultGameService());
        gameService.startService1();
        gameService.startService2();
    }
}
