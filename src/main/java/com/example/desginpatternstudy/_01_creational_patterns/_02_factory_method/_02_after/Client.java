package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after;

public class Client {
    public static void main(String[] args) {
        WhiteShipFactory whiteShipFactory = new WhiteShipFactory();
        BlackShipFactory blackShipFactory = new BlackShipFactory();
        WhiteShip whiteShip = (WhiteShip) whiteShipFactory.orderShip("whiteShip", "client1@naver.com");
        BlackShip blackShip = (BlackShip) blackShipFactory.orderShip("blackShip", "client2@naver.com");
        System.out.println(whiteShip);
        System.out.println(blackShip);
    }
}
