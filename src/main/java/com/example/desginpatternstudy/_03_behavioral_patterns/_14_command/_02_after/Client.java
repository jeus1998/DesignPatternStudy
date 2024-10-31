package com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after;

public class Client {
    public static void main(String[] args) {
        OKGoogle okGoogle = new OKGoogle();
        okGoogle.call(new HeaterOnCommand(new Heater()));
        okGoogle.call(new LampOnCommand(new Lamp()));
        okGoogle.undo();
        okGoogle.undo();
    }
}
