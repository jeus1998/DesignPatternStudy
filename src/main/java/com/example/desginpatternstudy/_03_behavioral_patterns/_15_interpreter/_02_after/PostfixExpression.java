package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._02_after;
import java.util.*;
public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
