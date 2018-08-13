package cn.com.bosssoft.loginmodule.service.impl;

import cn.com.bosssoft.loginmodule.domain.Account;
import cn.com.bosssoft.loginmodule.domain.User;
import cn.com.bosssoft.loginmodule.mapper.UserMapper;
import cn.com.bosssoft.loginmodule.service.AccountServer;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */
@Service
public class AccountServerImpl implements AccountServer {

    private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertAccount(Account account, User user) {
        logger.info("调用用户注册服务......");
        String result = restTemplate.postForObject("http://ZUUL-SERVICE/loginservice/user/register", user, String.class);
        logger.info("用户注册服务结束，返回值为: {}", result);
    }



}
