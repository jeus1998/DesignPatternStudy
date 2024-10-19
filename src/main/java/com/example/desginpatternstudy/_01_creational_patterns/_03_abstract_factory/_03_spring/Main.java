package com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory._03_spring;

import com.example.desginpatternstudy._01_creational_patterns._03_abstract_factory.Ship;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        ShipFactory bean = ac.getBean(ShipFactory.class);
        Ship shipBean = ac.getBean(Ship.class);
        System.out.println(shipBean.getName());
    }
}
