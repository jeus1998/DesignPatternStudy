package com.example.desginpatternstudy._03_behavioral_patterns._19_observer._02_after;
public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("jeu1");
        User user2 = new User("jeu2");

        chatServer.register("롤드컵", user1);
        chatServer.register("롤드컵", user2);
        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "롤드컵", "제우스");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 ~~");
    }
}
