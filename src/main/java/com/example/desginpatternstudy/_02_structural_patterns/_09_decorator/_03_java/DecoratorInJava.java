package com.example.desginpatternstudy._02_structural_patterns._09_decorator._03_java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add(3);

        // 서블릿 요청 또는 응답 랩퍼
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }
}
