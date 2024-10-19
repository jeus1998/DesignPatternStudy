package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._02_after;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.ShipFactory;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.WhiteShip;

public class ShipInventory {
    public static void main(String[] args) {
        // ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipProPartsFactory());
        WhiteShip ship = (WhiteShip)shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
