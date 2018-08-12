package cn.com.bosssoft.loginmodule.controller;

import cn.com.bosssoft.loginmodule.domain.Account;
import cn.com.bosssoft.loginmodule.domain.User;
import cn.com.bosssoft.loginmodule.service.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Shixiaodong
 * @date :  2018/8/3.
 */
@Controller
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping(value = "/register" )
    public String register(User user, Account account){
        accountServer.insertAccount(account, user);
        return "redirect:../index.jsp";

    }
}
