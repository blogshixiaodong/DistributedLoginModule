package cn.com.bosssoft.loginserver.controller;

import cn.com.bosssoft.loginserver.domain.User;
import cn.com.bosssoft.loginserver.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/13 14:46
 */
@RestController
public class UserController {


    @Autowired
    private UserServer userServer;

    @GetMapping("/list")
    public List<User> gtUserList() {
        List<User> userList = userServer.userList();
        return userList;
    }

}
