package com.example.desginpatternstudy._03_behavioral_patterns._15_interpreter._03_java;

import java.util.regex.Pattern;

public class InterpreterInJava {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".pr...", "spring"));
        System.out.println(Pattern.matches("[a-z]{6}", "spring"));
        System.out.println(Pattern.matches("bae[a-z]{3}[0-9]{4}", "baejeu1998"));
        System.out.println(Pattern.matches("\\d", "1")); // one digit
        System.out.println(Pattern.matches("\\D", "a")); // one non-digit
    }
}
