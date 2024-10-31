package com.example.desginpatternstudy._03_behavioral_patterns._16_iterator._02_after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Board {
    List<Post> posts = new ArrayList<>();
    public void addPost(String content){
        this.posts.add(new Post(content));
    }
    public Iterator<Post> getDefaultIterator(){
        return this.posts.iterator();
    }
    public Iterator<Post> getRecentPostIterator(){
        return new RecentPostIterator(this.posts);
    }
}
