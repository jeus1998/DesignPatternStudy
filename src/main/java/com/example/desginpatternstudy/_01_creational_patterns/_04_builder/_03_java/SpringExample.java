package com.example.desginpatternstudy._01_creational_patterns._04_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("www.naver.com")
                .path("java-study1")
                .encode()
                .build();
        System.out.println(uri);
    }
}
