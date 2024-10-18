package com.example.desginpatternstudy._01_creational_patterns._02_factory_method._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {
    public static void main(String[] args) {
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello1 = xmlFactory.getBean("hello", String.class);
        System.out.println(hello1);

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(Config.class);
        String hello2 = beanFactory.getBean("hello", String.class);
        System.out.println(hello2);
        String hello3 = "hello";

        System.out.println(hello2 == hello3); // String Constant Pool
    }
}
