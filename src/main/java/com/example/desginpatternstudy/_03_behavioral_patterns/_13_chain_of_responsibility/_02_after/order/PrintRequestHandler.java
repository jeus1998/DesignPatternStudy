package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after.order;

public class PrintRequestHandler extends RequestHandler {
    public PrintRequestHandler() {
    }
    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}