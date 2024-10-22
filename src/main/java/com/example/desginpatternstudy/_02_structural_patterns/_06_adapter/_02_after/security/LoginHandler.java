package com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after.security;

/**
 * 클라이언트 LoginHandler
 * 타깃: UserDetailsService <인터페이스>
 * Adaptee: AccountService
 */
public class LoginHandler {
    UserDetailsService userDetailsService;
    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    public String login(String username, String password){
        UserDetails userDetails = userDetailsService.loadUser(username);
        if(userDetails.getPassword().equals(password)){
            return userDetails.getUsername();
        }
        throw new IllegalArgumentException();
    }
}
