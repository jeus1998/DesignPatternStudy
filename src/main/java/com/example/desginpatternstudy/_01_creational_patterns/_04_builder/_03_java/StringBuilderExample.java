package com.example.desginpatternstudy._01_creational_patterns._04_builder._03_java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = sb.append("jeu").append("baejeu").toString();
        System.out.println(result);

        StringBuffer sf = new StringBuffer();
        String result2 = sf.append("jeu").append("baejeu").toString();
        System.out.println(result2);
    }
}
