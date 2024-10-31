package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._02_after.upgrade;

import java.util.Map;
public interface PostfixExpression {
    public int interpret(Map<Character, Integer> context);
    public static PostfixExpression plusExpression(PostfixExpression left, PostfixExpression right){
        return context -> left.interpret(context) + right.interpret(context);
    }
    public static PostfixExpression minusExpression(PostfixExpression left, PostfixExpression right){
        return context -> left.interpret(context) - right.interpret(context);
    }
    public static PostfixExpression variableExpression(Character character){
        return context -> context.get(character);
    }
    public static PostfixExpression multiplyExpression(PostfixExpression left, PostfixExpression right){
       return context -> left.interpret(context) * right.interpret(context);
    }
}
