package com.example.desginpatternstudy._03_behavioral_patterns._13_chain_of_responsibility._02_after.order;
import java.util.*;
public class RequestHandlerBuilder {
    private List<RequestHandler> requestHandlers = new ArrayList<>();
    private RequestHandlerBuilder(){
    }
    public static RequestHandlerBuilder builder(){
        return new RequestHandlerBuilder();
    }
    public RequestHandlerBuilder addHandler(RequestHandler requestHandler){
        requestHandlers.add(requestHandler);
        return this;
    }
    public RequestHandler build(){
        RequestHandler start  = null;
        RequestHandler before = null;
        int size = requestHandlers.size();
        for(int i = size - 1; i >= 0; i--){
            RequestHandler cur = requestHandlers.get(i);
            cur.setNextHandler(before);
            before = cur;
            if(i == 0) start = cur;
        }
        return start;
    }
}
