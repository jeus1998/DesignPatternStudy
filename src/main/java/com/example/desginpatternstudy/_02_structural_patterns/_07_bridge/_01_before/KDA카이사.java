package com.example.desginpatternstudy._02_structural_patterns._07_bridge._01_before;

public class KDA카이사 implements Champion {
    @Override
    public void move() {
        System.out.println("KDA 카이사 move");
    }
    @Override
    public void Q() {
        System.out.println("KDA 카이사 Q");
    }
    @Override
    public void W() {
        System.out.println("KDA 카이사 W");
    }
    @Override
    public void E() {
        System.out.println("KDA 카이사 E");
    }
    @Override
    public void R() {
        System.out.println("KDA 카이사 R");
    }
}
