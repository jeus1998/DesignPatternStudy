package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after;

public abstract class RequestHandler {
    private RequestHandler nextHandler;
    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handle(Request request){
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
