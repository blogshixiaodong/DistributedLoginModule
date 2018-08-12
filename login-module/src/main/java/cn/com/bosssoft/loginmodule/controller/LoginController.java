package cn.com.bosssoft.loginmodule.controller;

import cn.com.bosssoft.loginmodule.domain.Account;
import cn.com.bosssoft.loginmodule.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shixiaodong
 * @date 2018/8/8 0:01
 */
@Controller
@RequestMapping("/user")
public class LoginController implements ErrorController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public String login(Account account) {
        if(loginService.loginCheck(account)) {
            return "redirect:../user_list.jsp";
        }
        return "redirect:../error.jsp";
    }

    @Override
    public String getErrorPath() {
        return "redirect:../error.jsp";
    }
}
