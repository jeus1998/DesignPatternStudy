package com.example.desginpatternstudy._03_behavioral_patterns._20_sate._02_after;

public class Client {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("제우");

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("첫 리뷰", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
