package com.example.desginpatternstudy._03_behavioral_patterns._21_strategy._02_after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Faster());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("무광꼬치");
            }

            @Override
            public void redLight() {
                System.out.println("피어씀다.");
            }
        });
    }
}
