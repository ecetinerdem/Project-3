package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Account;

import java.util.List;

public class AccountServiceImpl implements AccountService{
    @Override
    public List<Account> findAll() {
        return List.of();
    }

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public List<Account> findByEmail(String email) {
        return List.of();
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public Account delete(Long id) {
        return null;
    }
}
