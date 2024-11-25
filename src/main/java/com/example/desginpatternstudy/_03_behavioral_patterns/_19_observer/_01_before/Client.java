package com.example.desginpatternstudy._03_behavioral_patterns._19_observer._01_before;
public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User(chatServer);
        User user2 = new User(chatServer);

        user1.sendMessage("디자인 패턴", "옵저버 패턴~");
        user1.sendMessage("오늘 날씨", "맑음");

        System.out.println(user2.getMessage("오늘 날씨"));

        user1.sendMessage("디자인 패턴", "싱글톤 패턴 어렵다");
        System.out.println(user2.getMessage("디자인 패턴"));
    }
}
