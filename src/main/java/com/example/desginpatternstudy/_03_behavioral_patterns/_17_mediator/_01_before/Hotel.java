package com.example.desginpatternstudy._03_behavioral_patterns._17_mediator._01_before;

public class Hotel {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTower(3);
        guest.dinner();

        Gym gym = new Gym();
        gym.clean();

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }
}
