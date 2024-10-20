package com.example.desginpatternstudy._01_creational_patterns._05_prototype._03_java;

import com.example.desginpatternstudy._01_creational_patterns._05_prototype._02_after.GithubIssue;
import com.example.desginpatternstudy._01_creational_patterns._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;
public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jeus1998");
        repository.setName("Desgin-Pattern-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: 스레드 세이프의 의미");

        System.out.println(githubIssue);

        // 반복 작업
        GithubIssueData githubIssueData = new GithubIssueData();
        githubIssueData.setId(githubIssue.getId());
        githubIssueData.setTitle(githubIssue.getTitle());
        githubIssueData.setRepositoryName(repository.getName());
        githubIssueData.setRepositoryUser(repository.getUser());

        // TODO ModelMapper
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData2 = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData2);
    }
}
