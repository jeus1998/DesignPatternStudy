package com.example.desginpatternstudy;

public enum Settings {
    INSTANCE;
}
/*
public enum Settings {
    INSTANCE;
    Settings(){} // default -> private not allowed public
    private int number = 10;
    public int getNumber(){
        return number;
    }
}
 */