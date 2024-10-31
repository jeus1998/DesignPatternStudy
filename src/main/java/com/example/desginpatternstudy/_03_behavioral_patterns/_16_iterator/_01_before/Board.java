package com.example.desginpatternstudy._03_behavioral_patterns._16_iterator._01_before;

import java.util.*;
public class Board {
    List<Post> posts = new ArrayList<>();
    public List<Post> getPosts(){
        return posts;
    }
    public void addPost(String content){
        this.posts.add(new Post(content));
    }
}
