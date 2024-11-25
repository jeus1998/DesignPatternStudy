package com.example.desginpatternstudy._03_behavioral_patterns._20_sate._02_after;

public class Private implements State{
    private OnlineCourse onlineCourse;
    public Private(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    /**
     * 현재 코드를 보면 onlineCourse.getStudents().contains(); 이렇게 체이닝을 2번 사용해서 가져온다.
     * 즉, 내부 컬렉션에 직접 접근하는데 이는 캡슐화를 위반한다.
     * 이는 리팩토링 관점에서 변화가 필요해 보인다.
     * OnlineCourse 클래스에서 객체의 내부 컬렉션 상태를 직접 노출하는 대신, 의미 있는 행위를 캡슐화한 메서드를 제공하는 것이 더 좋은 설계이다.
     */
    @Override
    public void addReview(String review, Student student) {
        if(this.onlineCourse.getStudents().contains(student)){
            this.onlineCourse.getReviews().add(review);
            return;
        }
        throw new UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.");
    }
    @Override
    public void addStudent(Student student) {
        if(student.isAvailable(this.onlineCourse)){
            this.onlineCourse.getStudents().add(student);
            return;
        }
        throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.");
    }
}
