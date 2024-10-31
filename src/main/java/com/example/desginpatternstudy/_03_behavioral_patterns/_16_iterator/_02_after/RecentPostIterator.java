package com.example.desginpatternstudy._03_behavioral_patterns._16_iterator._02_after;

import java.util.Iterator;
import java.util.List;
/**
 * 최신글을 순서대로 정렬해서 만들어진 이터레이터
 * ConcreteIterator: RecentPostIterator
 * Iterator: Iterator
 */
public class RecentPostIterator implements Iterator<Post> {
    private Iterator<Post> internalIterator;
    public RecentPostIterator(List <Post> posts) {
        posts.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }
    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }
    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
