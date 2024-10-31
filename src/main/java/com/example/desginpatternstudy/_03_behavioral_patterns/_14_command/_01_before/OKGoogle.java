package com.example.desginpatternstudy._03_behavioral_patterns._14_command._01_before;

import java.util.Objects;

public class OKGoogle {
    public static enum MODE {
        HEATER, LAMP
    }
    public static enum CONTROL{
        ON, OFF
    }
    private MODE mode;
    private Heater heater;
    private Lamp lamp;
    public OKGoogle(Heater heater, Lamp lamp){
        this.heater = heater;
        this.lamp = lamp;
    }
    public void setMode(MODE mode){
        this.mode = mode;
    }
    public void call(CONTROL control){
        if(Objects.isNull(mode)){
            throw new IllegalStateException("mode is not defined");
        }
        switch (mode){
            case LAMP -> {
                if(CONTROL.ON.equals(control)){
                    lamp.turnOn();
                }
                else lamp.turnOff();
            }
            case HEATER -> {
                if(CONTROL.ON.equals(control)){
                    heater.powerOn();
                }
                else heater.powerOff();
            }
        }
    }
}
