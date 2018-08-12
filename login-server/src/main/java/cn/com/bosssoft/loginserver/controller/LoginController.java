package cn.com.bosssoft.loginserver.controller;

import cn.com.bosssoft.loginserver.domain.Account;
import cn.com.bosssoft.loginserver.service.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shixiaodong
 * @date 2018/8/10 10:57
 */
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private AccountServer accountServer;

    @RequestMapping("/login")
    public Integer login( Account account) {
        boolean loginResult = accountServer.loginCheck(account);
        if(loginResult) {
            return 0;
        }
        return -1;
    }
}
