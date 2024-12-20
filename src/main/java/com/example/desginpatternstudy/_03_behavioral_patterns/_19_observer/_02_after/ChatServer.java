package com.example.desginpatternstudy._03_behavioral_patterns._19_observer._02_after;

import java.util.*;
public class ChatServer {
    private Map<String, List<Subscriber>> subscribers;
    public ChatServer() {
        subscribers = new HashMap<>();
    }
    public void register(String subject, Subscriber subscriber){
        if(subscribers.containsKey(subject)){
            subscribers.get(subject).add(subscriber);
            return;
        }
        List<Subscriber> list = new ArrayList<>();
        list.add(subscriber);
        subscribers.put(subject, list);
    }
    public void unregister(String subject, Subscriber subscriber){
        if (subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }
    public void sendMessage(User user, String subject, String message){
        if(subscribers.containsKey(subject)){
            String userMessage = user.getName() + ": " + message;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMessage));
        }
    }
}
