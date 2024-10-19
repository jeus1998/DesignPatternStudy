package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._02_after;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.DefaultShipFactory;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Ship;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {
    private ShipPartsFactory shipPartsFactory;
    public WhiteShipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }
    /**
     * 구체적으로 어떤 클래스의 인스턴스를(concrete product)를 사용하는지 감출 수 있다
     */
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
