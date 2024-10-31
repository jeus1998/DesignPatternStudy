package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._01_before;

public class AuthRequestHandler extends RequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("인증 확인 프로세스");
        super.handle(request);
    }
}
