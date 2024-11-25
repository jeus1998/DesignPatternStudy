package com.example.desginpatternstudy._03_behavioral_patterns._21_strategy._03_java;

import java.util.*;
public class JavaComparator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(21);
        numbers.add(102);
        System.out.println(numbers); // 100, 21, 102

        Collections.sort(numbers, (o1, o2) -> o1 - o2);
        System.out.println(numbers); // 21, 100, 102
    }
}
