package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._02_after;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Anchor;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Wheel;

public class WhiteShipProPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }
    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
