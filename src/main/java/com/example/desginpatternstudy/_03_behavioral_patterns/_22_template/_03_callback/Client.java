package com.example.desginpatternstudy._03_behavioral_patterns._22_template._03_callback;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");

        int plusResult = fileProcessor.process(0, ((result, number) -> result += number));
        System.out.println("plusResult = " + plusResult);        // 15

        int multiplyResult = fileProcessor.process(1, ((result, number) -> result *= number));
        System.out.println("multiplyResult = " + multiplyResult); // 120
    }
}
