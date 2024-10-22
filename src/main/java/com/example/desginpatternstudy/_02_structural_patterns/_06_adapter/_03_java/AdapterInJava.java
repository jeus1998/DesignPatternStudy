package com.example.desginpatternstudy._02_structural_patterns._06_adapter._03_java;

import java.io.*;
import java.util.*;
public class AdapterInJava {
    public static void main(String[] args) {
        // Collections
        List<String> strings = Arrays.asList("a", "b", "c");
        // Iterator 유사 -> 차이점: 요소 삭제 불가능
        Enumeration<String> enumeration = Collections.enumeration(strings);
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }

        // io
        try(InputStream is = new FileInputStream("input");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
