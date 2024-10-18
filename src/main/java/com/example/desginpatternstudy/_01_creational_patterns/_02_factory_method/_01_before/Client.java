package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._01_before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("whiteShip", "client1@naver.com");
        Ship blackShip = ShipFactory.orderShip("blackShip", "client2@naver.com");
        System.out.println(whiteShip);
        System.out.println(blackShip);
    }
}
