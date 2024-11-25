package com.example.desginpatternstudy._03_behavioral_patterns._20_state._01_before;
import java.util.*;

public class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }
    private List<OnlineCourse> privateCourses = new ArrayList<>();
    public boolean isEnabledForPrivateClass(OnlineCourse onlineCourse){
        return this.privateCourses.contains(onlineCourse);
    }
    public void addCourse(OnlineCourse onlineCourse){
        this.privateCourses.add(onlineCourse);
    }
}
