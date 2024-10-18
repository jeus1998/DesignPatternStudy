package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after;

public class WhiteShipFactory implements ShipFactory{
    @Override
    public Ship createShip(String name) {
        WhiteShip ship = new WhiteShip();
        ship.setName(name);
        ship.setColor("white");
        return ship;
    }
}
