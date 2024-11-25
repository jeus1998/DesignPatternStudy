package com.example.desginpatternstudy._03_behavioral_patterns._22_template._02_after;

public class Client {
    public static void main(String[] args) {
        Multiply multiply = new Multiply("number.txt");
        Plus plus = new Plus("number.txt");

        System.out.println(multiply.process(1)); // 120
        System.out.println(plus.process(0));     // 15
    }
}
