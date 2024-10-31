package com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after;

public class HeaterOnCommand implements Command{
    private Heater heater;
    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }
    @Override
    public void execute() {
        heater.powerOn();
    }
    @Override
    public void undo() {
        new HeaterOffCommand(this.heater).execute();
    }
}
