package com.workintech.s19d2.service;

import com.workintech.s19d2.entity.Account;
import com.workintech.s19d2.exceptions.AccountException;
import com.workintech.s19d2.repository.AccountRepository;
import com.workintech.s19d2.repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;



@AllArgsConstructor
@Service
@Data
public class AccountServiceImpl implements AccountService{

    private final AccountRepository accountRepository;
    private  final MemberRepository memberRepository;


    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new AccountException("Account does not exist with id " + id, HttpStatus.NOT_FOUND));
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
