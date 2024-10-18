package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after;

public class Client {
    public static void main(String[] args) {
         Client client1 = new Client();
         Client client2 = new Client();
         client1.print(new WhiteShipFactory(), "whiteShip", "client1@naver.com");
         client2.print(new BlackShipFactory(), "blackShip", "client2@naver.com");
    }
    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }
}
