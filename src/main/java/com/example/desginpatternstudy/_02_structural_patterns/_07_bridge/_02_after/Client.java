package com.example.desginpatternstudy._02_structural_patterns._07_bridge._02_after;

public class Client {
    public static void main(String[] args) {
        Champion 수영장파티아리 = new 아리(new 수영장파티());
        수영장파티아리.move();

        Champion KDA카이사 = new 카이사(new KDA());
        KDA카이사.R();
    }
}
