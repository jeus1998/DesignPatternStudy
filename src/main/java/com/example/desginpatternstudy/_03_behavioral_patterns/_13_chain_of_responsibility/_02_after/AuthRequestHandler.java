package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after;

public class AuthRequestHandler extends RequestHandler{
    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void handle(Request request) {
        System.out.println("인증 프로세스");
        super.handle(request);
    }
}
