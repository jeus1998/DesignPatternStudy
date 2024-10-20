package com.example.desginpatternstudy._01_creational_patterns._05_prototype._03_java;

import java.util.*;
public class CollectionExample {
    public static void main(String[] args) {
        Student student1 = new Student("jeu1");
        Student student2 = new Student("jeu2");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        // List -> cloneable 구현 x
        ArrayList<Student> clone = (ArrayList<Student>) students.clone();
        System.out.println(clone);

        // 생성자 방식
        List<Student> clone2 = new ArrayList<>(students);
        System.out.println(clone2);
    }
}
