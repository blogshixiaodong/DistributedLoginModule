package cn.com.bosssoft.loginserver.controller;

import cn.com.bosssoft.loginserver.domain.Account;
import cn.com.bosssoft.loginserver.domain.User;
import cn.com.bosssoft.loginserver.service.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Shixiaodong
 * @date :  2018/8/3.
 */
@Controller
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping("/register" )
    public String register(@RequestParam User user, @RequestParam Account account) {
        accountServer.insertAccount(account, user);
        return "0";
    }
}
