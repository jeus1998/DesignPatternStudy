package com.example.desginpatternstudy._03_behavioral_patterns._19_observer._01_before;

import java.util.*;
public class ChatServer {
    private Map<String, List<String>> messages;
    public ChatServer() {
        this.messages = new HashMap<>();
    }
    public void add(String subject, String message){
        if(messages.containsKey(subject)){
            messages.get(subject).add(message);
            return;
        }
        List<String> messageList = new ArrayList<>();
        messageList.add(message);
        messages.put(subject, messageList);
    }
    public List<String> getMessage(String subject){
        return messages.get(subject);
    }
}
