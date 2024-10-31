package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after.order;

import lombok.Setter;

@Setter
public abstract class RequestHandler {
    private RequestHandler nextHandler;
    protected RequestHandler() {
    }
    public void handle(Request request){
        if(nextHandler != null){
            nextHandler.handle(request);
        }
    }
}
