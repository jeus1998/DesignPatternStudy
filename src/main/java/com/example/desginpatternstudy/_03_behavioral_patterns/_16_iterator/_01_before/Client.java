package com.example.desginpatternstudy._03_behavioral_patterns._16_iterator._01_before;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        Board board = new Board();
        board.addPost("내용1");
        Thread.sleep(100L);
        board.addPost("내용2");
        Thread.sleep(100L);
        board.addPost("내용3");
        Thread.sleep(100L);

        // 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        for(int i = 0; i < posts.size(); i++){
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
        // 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (o1, o2) -> o2.getCreatedDateTime().compareTo(o1.getCreatedDateTime()));
        for(int i = 0; i < posts.size(); i++){
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
    }
}
