package com.example.desginpatternstudy._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {
    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();
    public void getTowers(Guest guest, int numberOfTowers) {
        // 여기서 Guest 넘기면 안 된다. -> 최소한의 정보만 넘기는 게 핵심
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }
    public String getRoomNumber(Integer guestId) {
        return "1111";
    }
    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
