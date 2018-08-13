package cn.com.bosssoft.loginserver.controller;

import cn.com.bosssoft.loginserver.domain.User;
import cn.com.bosssoft.loginserver.service.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Shixiaodong
 * @date :  2018/8/3.
 */
@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping("/register" )
    public String register(@RequestBody User user) {
        accountServer.insertAccount(user.getAccount(), user);
        return "0";
    }
}
