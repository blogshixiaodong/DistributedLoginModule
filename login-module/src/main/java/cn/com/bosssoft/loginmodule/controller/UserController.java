package cn.com.bosssoft.loginmodule.controller;

import cn.com.bosssoft.loginmodule.domain.PageContainer;
import cn.com.bosssoft.loginmodule.domain.User;
import cn.com.bosssoft.loginmodule.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shixiaodong
 * @date 2018/8/3 23:35
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServer userServer;


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView userList(PageContainer<User> pageContainer) {
        pageContainer = userServer.getUserList(pageContainer);
        System.out.println(pageContainer);
        Map<String, String> map = new HashMap<>();
        map.put("pageContainer", pageContainer.toJson());
        return new ModelAndView(new MappingJackson2JsonView(), map);
    }

    @RequestMapping("userList")
    public @ResponseBody List<User> getUserList() {
        return userServer.userList();
    }

}
