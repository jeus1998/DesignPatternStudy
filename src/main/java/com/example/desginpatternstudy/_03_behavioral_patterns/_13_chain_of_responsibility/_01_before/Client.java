package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._01_before;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("요청");
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handle(request);
    }
}
