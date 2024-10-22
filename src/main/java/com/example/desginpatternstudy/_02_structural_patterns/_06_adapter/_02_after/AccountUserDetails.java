package com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after;

import com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetails implements UserDetails {
    private final Account account;
    @Override
    public String getUsername() {
        return account.getName();
    }
    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
