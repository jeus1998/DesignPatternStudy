package com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after;



public class LampOnCommand implements Command{
    private Lamp lamp;
    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }
    @Override
    public void execute() {
       lamp.turnOn();
    }
    @Override
    public void undo() {
        new LampOffCommand(this.lamp).execute();
    }
}
