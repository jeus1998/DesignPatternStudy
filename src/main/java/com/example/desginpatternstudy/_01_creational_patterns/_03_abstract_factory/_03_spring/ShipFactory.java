package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._03_spring;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Ship;
import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean -> Abstract Factory
 * Ship 인스턴스를 Bean 만들어준다.
 * 스프링 내부에서 사용
 * 이렇게 확장이 가능한 이유: OCP 지켜지기 때문에
 */
public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("hello");
        return ship;
    }
    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
