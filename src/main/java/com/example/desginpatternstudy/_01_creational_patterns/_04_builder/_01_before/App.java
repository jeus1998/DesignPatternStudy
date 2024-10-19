package com.example.desginpatternstudy._01_creational_patterns._04_builder._01_before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("일본 오사카 여행");
        tourPlan.setStartDate(LocalDate.of(2024,11,1));
        tourPlan.setNights(1);
        tourPlan.setDays(2);  // 1박 2일
        tourPlan.setWhereToStay("오사카 호텔");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 뷔페에서 식사");
        tourPlan.addPlan(1, "유니버셜 스튜디오");
        tourPlan.addPlan(1, "온천 힐링");
        tourPlan.addPlan(1, "체크아웃");

        TourPlan shortPlan = new TourPlan();
        shortPlan.setTitle("당일치기 여수 여행");
        shortPlan.setStartDate(LocalDate.of(2024, 11, 1));
    }
}
