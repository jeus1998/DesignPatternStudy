package com.example.desginpatternstudy._02_structural_patterns._09_decorator._01_before;

public class Client {
    private boolean spamFilter;
    private boolean trimFilter;
    private final CommentService commentService;
    public Client(CommentService commentService) {
        this.commentService = commentService;
    }
    public void writeComment(String comment){
        commentService.addComment(comment);
    }
    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("댓글1");
        client.writeComment("...댓글2...");
        client.writeComment("https://baejeu1212.tistory.com");
    }
}
