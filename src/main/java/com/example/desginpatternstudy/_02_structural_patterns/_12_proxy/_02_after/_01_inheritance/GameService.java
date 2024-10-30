package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._01_inheritance;

public class GameService {
    public void gameService1() {
        System.out.println("gameService1");
        sleep();
    }
    public void gameService2(){
        System.out.println("gameService2");
        sleep();
    }
    private static void sleep(){
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
