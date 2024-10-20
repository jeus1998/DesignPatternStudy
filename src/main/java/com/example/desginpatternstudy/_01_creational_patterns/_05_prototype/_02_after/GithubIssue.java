package com.example.desginpatternstudy._01_creational_patterns._05_prototype._02_after;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@EqualsAndHashCode @ToString
public class GithubIssue implements Cloneable{
    private int id;
    private String title;
    private GithubRepository repository;
    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }
    public String getUrl(){
        return String.format("https://github.com/%s/%s/issues/%d",
                    repository.getUser(),
                    repository.getName(),
                    this.getId()
                );
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser(this.repository.getUser());
        githubRepository.setName(this.repository.getName());

        GithubIssue githubIssue = (GithubIssue) super.clone();
        githubIssue.setRepository(githubRepository);
        return githubIssue;
    }
}
