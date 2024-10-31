package com.example.desginpatternstudy._03_behavioral_patterns._16_iterator._02_after;

import java.util.Iterator;
public class Client {
    public static void main(String[] args) throws InterruptedException{
        Board board = new Board();
        board.addPost("내용1");
        Thread.sleep(100L);
        board.addPost("내용2");
        Thread.sleep(100L);
        board.addPost("내용3");
        Thread.sleep(100L);

        // 들어간 순서대로 조회하기
        Iterator<Post> iterator = board.getDefaultIterator();
        while (iterator.hasNext()){
            Post post = iterator.next();
            System.out.println(post.getTitle());
        }

        // 최신 글 순서대로 조회
        Iterator<Post> recentIterator = board.getRecentPostIterator();
        while (recentIterator.hasNext()){
            Post post = recentIterator.next();
            System.out.println(post.getTitle());
        }
    }
}
