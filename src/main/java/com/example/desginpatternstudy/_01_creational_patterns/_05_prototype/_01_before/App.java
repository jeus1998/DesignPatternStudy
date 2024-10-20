package com.example.desginpatternstudy._01_creational_patterns._05_prototype._01_before;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jeus1998");
        repository.setName("Desgin-Pattern-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: 스레드 세이프의 의미");

        String url = githubIssue.getUrl();
        System.out.println(url);

        // TODO make clone() API
        // GithubIssue clone = githubIssue.clone();

        // TODO clone != githubIssue
        // TODO clone.equals(githubIssue) => true
    }
}
