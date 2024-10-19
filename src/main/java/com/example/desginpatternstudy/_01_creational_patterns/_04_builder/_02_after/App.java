package com.example.desginpatternstudy._01_creational_patterns._04_builder._02_after;

import com.example.desginpatternstudy._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("오사카 여행")
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

        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan seoulTrip = tourDirector.seoulTrip();
        TourPlan osakaTrip = tourDirector.osakaTrip();
        System.out.println(seoulTrip);
        System.out.println(osakaTrip);
    }
}
