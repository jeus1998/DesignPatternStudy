package com.example.desginpatternstudy._01_creational_patterns._05_prototype._02_after;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jeus1998");
        repository.setName("Desgin-Pattern-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: 스레드 세이프의 의미");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // throws CloneNotSupportedException
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());

        repository.setUser("jeus");

        System.out.println(clone.getUrl());
        // 기본적으로 자바가 제공하는 clone() -> shallow copy
        System.out.println(clone.getRepository() != githubIssue.getRepository());

        // 이전 객체의 내부 필드까지 모두 새로운 인스턴스를 만들고 싶다 -> deep copy -> custom 구현

    }
}
