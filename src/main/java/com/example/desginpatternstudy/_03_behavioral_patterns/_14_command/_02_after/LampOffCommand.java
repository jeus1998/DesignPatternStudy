package com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after;

public class LampOffCommand implements Command{
    private Lamp lamp;
    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }
    @Override
    public void execute() {
        lamp.turnOff();
    }
    @Override
    public void undo() {
        new LampOnCommand(this.lamp).execute();
    }
}
