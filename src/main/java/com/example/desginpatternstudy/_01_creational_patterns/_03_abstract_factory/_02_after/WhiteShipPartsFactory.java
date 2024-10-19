package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._02_after;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Anchor;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Wheel;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.WhiteAnchor;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }
    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
