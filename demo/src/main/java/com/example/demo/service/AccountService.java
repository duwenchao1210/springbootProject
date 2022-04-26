package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public Object addUser(Account account) {
        accountMapper.add(account);
        return "success";
    }

    public Object login(Account account) {
        return accountMapper.login(account);
    }
}
