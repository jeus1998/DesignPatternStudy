package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._02_after.upgrade;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Stack;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PostfixExpressionFactory {
    public static PostfixExpression parse(String expression){
        Stack<PostfixExpression> stack = new Stack<>();
        for(Character c : expression.toCharArray()){
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }
    private static PostfixExpression getExpression(Character c, Stack<PostfixExpression> stack) {
        switch (c){
            case '+' -> {
                return PostfixExpression.plusExpression(stack.pop(), stack.pop());
            }
            case '-' -> {
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return PostfixExpression.minusExpression(left, right);
            }
            case '*' -> {
                return PostfixExpression.multiplyExpression(stack.pop(), stack.pop());
            }
            default -> {
                return PostfixExpression.variableExpression(c);
            }
        }
    }
}
