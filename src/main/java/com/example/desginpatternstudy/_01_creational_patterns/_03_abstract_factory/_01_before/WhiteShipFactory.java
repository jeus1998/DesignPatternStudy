package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._01_before;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.*;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
