package com.example.desginpatternstudy._02_structural_patterns._10_facade._03_java;

import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
public class FacadeInSpring {
    public static void main(String[] args) {
        // MailSender mailSender = new JavaMailSenderImpl();
        PlatformTransactionManager platformTransactionManager = new JdbcTransactionManager();
    }
}
