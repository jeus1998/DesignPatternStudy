package com.example.desginpatternstudy._02_structural_patterns._12_proxy._02_after._03_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHandler implements InvocationHandler {
    private Object target;
    public TimeInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        System.out.println(System.currentTimeMillis() - start);
        return result;
    }
}
