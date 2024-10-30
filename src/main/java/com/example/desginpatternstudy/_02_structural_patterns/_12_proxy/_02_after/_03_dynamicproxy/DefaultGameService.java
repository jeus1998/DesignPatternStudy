package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._03_dynamicproxy;
public class DefaultGameService implements GameService {
    @Override
    public void startService1() {
        System.out.println("gameService1");
        sleep();
    }
    @Override
    public void startService2() {
        System.out.println("gameService2");
        sleep();
    }
    private static void sleep(){
       try {
           Thread.sleep(1000L);
       }
       catch (InterruptedException e){
           e.printStackTrace();
       }
   }
}
