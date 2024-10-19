package com.example.desginpatternstudy._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> build = Stream.<String>builder().add("baejeu").add("jeu").build();
        build.forEach(System.out::println);
    }
}
