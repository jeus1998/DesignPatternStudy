package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._01_before;

import lombok.RequiredArgsConstructor;

import java.util.Stack;

/**
 * 10 이하의 후위 표현식을 계산
 */
@RequiredArgsConstructor
public class PostFixNotation {
    private final String expression;
    private void calculate(){
        Stack<Integer> numbers = new Stack<>();
        for(char c : expression.toCharArray()){
            switch (c){
                case '+' -> {
                    numbers.push(numbers.pop() + numbers.pop());
                }
                case '-' -> {
                    int right = numbers.pop();
                    int left  = numbers.pop();
                    numbers.push(left - right);
                }
                default -> {
                    numbers.push(c - '0');
                }
            }
        }
        System.out.println(numbers.peek());
    }
    public static void main(String[] args) {
        PostFixNotation postFixNotation = new PostFixNotation("123+-");
        postFixNotation.calculate();
    }
}
