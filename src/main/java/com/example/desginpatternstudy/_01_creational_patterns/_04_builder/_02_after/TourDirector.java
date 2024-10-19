package com.example.desginpatternstudy._01_creational_patterns._04_builder._02_after;

import com.example.desginpatternstudy._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private final TourPlanBuilder tourPlanBuilder;
    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }
    public TourPlan osakaTrip(){
        return tourPlanBuilder.title("오사카 여행")
                        .nightsAndDays(1, 2)
                        .whereToStay("오사카 호텔")
                        .startDate(LocalDate.of(2024, 11, 1))
                        .addPlan(0, "체크인 이후 짐풀기")
                        .addPlan(0, "저녁 식사")
                        .addPlan(1, "조식 뷔페에서 식사")
                        .addPlan(1, "유니버셜 스튜디오")
                        .addPlan(1, "온천 힐링")
                        .addPlan(1, "체크아웃")
                        .getPlan();
    }
    public TourPlan seoulTrip(){
        return tourPlanBuilder.title("서울 여행")
                        .nightsAndDays(1, 2)
                        .whereToStay("서울 호텔")
                        .startDate(LocalDate.of(2024, 11, 1))
                        .addPlan(0, "체크인 이후 짐풀기")
                        .addPlan(0, "저녁 식사")
                        .addPlan(1, "조식 뷔페에서 식사")
                        .addPlan(1, "롯데월드")
                        .addPlan(1, "체크아웃")
                        .getPlan();
    }
}
