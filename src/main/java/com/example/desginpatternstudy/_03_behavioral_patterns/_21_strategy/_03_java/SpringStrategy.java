package com.example.desginpatternstudy._03_behavioral_patterns._21_strategy._03_java;

import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class SpringStrategy {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext();
        ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext();

        BeanDefinitionParser parser;
        PlatformTransactionManager platformTransactionManager;
        CacheManager cacheManager;
    }
}
