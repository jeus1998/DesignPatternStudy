package com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after;

public class HeaterOffCommand implements Command{
    private Heater heater;
    public HeaterOffCommand(Heater heater) {
        this.heater = heater;
    }
    @Override
    public void execute() {
        heater.powerOff();
    }
    @Override
    public void undo() {
        new HeaterOnCommand(this.heater).execute();
    }
}
