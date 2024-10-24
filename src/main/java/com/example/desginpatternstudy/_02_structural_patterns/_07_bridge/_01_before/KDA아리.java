package com.example.desginpatternstudy._02_structural_patterns._07_bridge._01_before;

public class KDA아리 implements Champion {
    @Override
    public void move() {
        System.out.println("KDA 아리 move");
    }
    @Override
    public void Q() {
        System.out.println("KDA 아리 Q");
    }
    @Override
    public void W() {
        System.out.println("KDA 아리 W");
    }
    @Override
    public void E() {
        System.out.println("KDA 아리 E");
    }
    @Override
    public void R() {
        System.out.println("KDA 아리 R");
    }
}
