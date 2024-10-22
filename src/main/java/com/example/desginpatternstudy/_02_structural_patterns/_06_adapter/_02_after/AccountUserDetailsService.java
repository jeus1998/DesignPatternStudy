package com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after;

import com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import com.example.desginpatternstudy._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {
    private final AccountService accountService;
    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
