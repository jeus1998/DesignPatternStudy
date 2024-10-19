package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._02_after;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Anchor;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Wheel;

/**
 * Abstract Factory 추상 펙토리
 * 서로 관련있는 여러 객체를 만들어주는 인터페이스
 */
public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
