package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._02_after;

import java.util.*;
public class PostfixParser {
    private PostfixParser() {
    }
    public static PostfixExpression parse(String expression){
        Stack<PostfixExpression> expressions = new Stack<>();
        for(char c : expression.toCharArray()){
            expressions.push(getExpression(c, expressions));
        }
        return expressions.pop();
    }
    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> expressions) {
        switch (c){
            case '+' -> {
                return new PlusExpression(expressions.pop(), expressions.pop());
            }
            case '-' -> {
                PostfixExpression right = expressions.pop();
                PostfixExpression left = expressions.pop();
                return new MinusExpression(left, right);
            }
            default -> {
                return new VariableExpression(c);
            }
        }
    }
}
