package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._03_dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        GameService target = new DefaultGameService();
        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        // 동적 Proxy 인스턴스 생성
        GameService proxy = (GameService) Proxy.newProxyInstance
                (GameService.class.getClassLoader(), new Class[]{GameService.class}, handler);

        proxy.startService1();
        proxy.startService2();

        // Proxy API
        System.out.println(proxy);
        System.out.println(proxy.getClass()); // class jdk.proxy1.$Proxy0
        System.out.println(Proxy.isProxyClass(proxy.getClass())); // true
    }
}
