package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._02_interface;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameServiceProxy implements GameService{
    private final GameService target;
    @Override
    public void startService1() {
        long start = System.currentTimeMillis();
        target.startService1();
        System.out.println(System.currentTimeMillis() - start);
    }
    @Override
    public void startService2() {
        long start = System.currentTimeMillis();
        target.startService2();
        System.out.println(System.currentTimeMillis() - start);
    }
}
