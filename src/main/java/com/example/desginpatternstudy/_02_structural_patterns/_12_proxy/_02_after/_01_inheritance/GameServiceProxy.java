package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._01_inheritance;

public class GameServiceProxy extends GameService {
    @Override
    public void gameService1() {
        long start = System.currentTimeMillis();
        super.gameService1();
        System.out.println(System.currentTimeMillis() - start);
    }
    @Override
    public void gameService2() {
        long start = System.currentTimeMillis();
        super.gameService2();
        System.out.println(System.currentTimeMillis() - start);
    }
}
