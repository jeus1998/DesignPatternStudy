package com.example.desginpatternstudy._02_structural_patterns._09_decorator._02_after;

public class SpamFilteringCommentDecorator extends CommentDecorator{
    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }
    @Override
    public void addComment(String comment) {
        if(!isSpam(comment)){
            super.addComment(comment);
        }
    }
    public boolean isSpam(String comment){
        if(comment.startsWith("https")) return true;
        return false;
    }
}
