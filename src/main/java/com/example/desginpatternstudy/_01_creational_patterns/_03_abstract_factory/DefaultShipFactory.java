package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory;

public abstract class DefaultShipFactory implements ShipFactory{
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
