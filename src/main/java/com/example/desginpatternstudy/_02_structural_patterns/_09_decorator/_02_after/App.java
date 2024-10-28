package com.example.desginpatternstudy._02_structural_patterns._09_decorator._02_after;

public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;
    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        if(enabledSpamFilter){
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if(enabledTrimming){
            commentService = new TrimmingCommentDecorator(commentService);
        }
        Client client = new Client(commentService);
        client.writeComment("댓글1");
        client.writeComment("...댓글2...");
        client.writeComment("https://baejeu1212.tistory.com");
    }
}
