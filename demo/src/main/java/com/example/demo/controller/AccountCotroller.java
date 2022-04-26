package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

/**
 * 账号
 */
@Controller
@RequestMapping("account")
public class AccountCotroller {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    //注册信息
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(@ModelAttribute("account") Account account){
        System.out.println("add");
        accountService.addUser(account);
        return "success";
    }


}
