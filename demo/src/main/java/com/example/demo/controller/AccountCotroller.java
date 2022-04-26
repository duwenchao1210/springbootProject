package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 账号
 */
@Controller
@RequestMapping("account")
public class AccountCotroller {

    /**
     * 登录页
     */
    @Autowired
    private AccountService accountService;
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    /**
     * 登录操作
     * @param account
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Object login(@ModelAttribute("account") Account account, ModelMap model,HttpServletRequest request){
        HttpSession session = request.getSession();
        Account login = (Account)accountService.login(account);
        if (null !=login ){
            session.setAttribute("account",login.getName());
            return "index";
        }else {
           model.addAttribute("message","用户名或者密码错误!");
            return "register";
        }

    }

    @RequestMapping("/loginOut")
    public Object loginOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("account");
        session.invalidate();
        return "register";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(@ModelAttribute("account") Account account){
        System.out.println("add");
        accountService.addUser(account);
        return "success";
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(){
        return "success";
    }

}
