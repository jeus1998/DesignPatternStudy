package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._01_before;

public class RequestHandler {
    public void handle(Request request){
        System.out.println(request.getBody());
    }
}
