package cn.com.bosssoft.loginmodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shixiaodong
 * @date 2018/8/11 19:52
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
