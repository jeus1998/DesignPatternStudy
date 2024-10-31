package com.example.desginpatternstudy._03_behavioral_patterns._14_command._01_before;

public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        OKGoogle okGoogle = new OKGoogle(heater, lamp);

        okGoogle.setMode(OKGoogle.MODE.HEATER);
        okGoogle.call(OKGoogle.CONTROL.ON);
        okGoogle.call(OKGoogle.CONTROL.OFF);

        okGoogle.setMode(OKGoogle.MODE.LAMP);
        okGoogle.call(OKGoogle.CONTROL.ON);
        okGoogle.call(OKGoogle.CONTROL.OFF);
    }
}
