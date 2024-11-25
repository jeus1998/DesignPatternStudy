package com.example.desginpatternstudy._03_behavioral_patterns._20_state._02_after;

import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@ToString
public class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }

    private Set<OnlineCourse> onlineCourses = new HashSet<>();
    public boolean isAvailable(OnlineCourse onlineCourse){
        return onlineCourses.contains(onlineCourse);
    }
    public void addCourse(OnlineCourse onlineCourse){
        this.onlineCourses.add(onlineCourse);
    }
}
