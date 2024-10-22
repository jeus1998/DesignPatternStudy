package com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after;

import com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after.security.LoginHandler;
public class App {
    public static void main(String[] args) {
        LoginHandler loginHandler = new LoginHandler(new AccountUserDetailsService(new AccountService()));
        String login = loginHandler.login("bae", "bae");
        System.out.println(login);
    }
}
