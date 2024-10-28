package com.example.desginpatternstudy._02_structural_patterns._09_decorator._01_before;

public class SpamFilteringCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        if(!isSpam(comment)){
            super.addComment(comment);
        }
    }
    public boolean isSpam(String comment){
        if(comment.startsWith("https")){
            return true;
        }
        return false;
    }
}
