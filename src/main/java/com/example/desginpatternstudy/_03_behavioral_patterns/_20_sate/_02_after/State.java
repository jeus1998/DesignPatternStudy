package com.example.desginpatternstudy._03_behavioral_patterns._20_sate._02_after;

public interface State {
    void addReview(String review, Student student);
    void addStudent(Student student);
}
