package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._03_java;

import com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after.BlackShip;
import com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after.Ship;
import com.example.desginpatternstudy._01_creational_patterns._02_factory_method._02_after.WhiteShip;

/**
 * Calendar simple factory
 */
public class SimpleFactory {
    public Ship createProduct(String name){
        if(name.equals("whiteShip")){
            return new WhiteShip();
        }
        else if(name.equals("blackShip")){
            return new BlackShip();
        }
        throw new IllegalArgumentException();
    }
}
