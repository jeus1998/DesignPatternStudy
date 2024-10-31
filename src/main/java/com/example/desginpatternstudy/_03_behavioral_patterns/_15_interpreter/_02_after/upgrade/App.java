package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._02_after.upgrade;

import java.util.*;
public class App {
    public static void main(String[] args) {
        PostfixExpression expression = PostfixExpressionFactory.parse("xyz-+k*");
        int result = expression.interpret(Map.of('x', 5, 'y', 9, 'z', 5, 'k', 3));
        System.out.println("result = " + result);
    }
}
