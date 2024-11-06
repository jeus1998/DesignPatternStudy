package com.example.desginpatternstudy._03_behavioral_patterns._17_mediator._01_before;

public class CleaningService {
    public void clean(Gym gym){
        System.out.println("clean " + gym);
    }
    public void clean(Restaurant restaurant){
        System.out.println("clean " + restaurant);
    }
    public void getTower(Guest guest, int numberOfTower) {
        System.out.println(numberOfTower + " towers to" + guest);
    }
}
