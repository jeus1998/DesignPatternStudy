package com.example.desginpatternstudy._03_behavioral_patterns._14_command._03_java;

import com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after.Heater;
import com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after.Lamp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class CommandInJava {
    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(heater::powerOn);
        executorService.submit(heater::powerOff);
        executorService.submit(lamp::turnOn);
        executorService.submit(lamp::turnOff);
    }
}
