package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._01_before;

public class LoggingRequestHandler extends RequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
