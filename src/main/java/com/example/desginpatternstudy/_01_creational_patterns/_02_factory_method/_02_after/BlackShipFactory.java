package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip(String name) {
        BlackShip ship = new BlackShip();
        ship.setName(name);
        ship.setColor("black");
        return ship;
    }
}
