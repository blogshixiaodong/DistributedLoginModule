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
//        Map<String, Object> map = new HashMap<>();
//        map.put("accountId", account.getAccountId());
//        map.put("password", account.getPassword());
//        map.put("username", user.getUsername());
//        map.put("gender", user.getGender());
//        map.put("address", user.getAddress());

        JSONObject json = new JSONObject();
        json.put("accountId", account.getAccountId());
        json.put("password", account.getPassword());
        json.put("username", user.getUsername());
        json.put("gender", user.getGender());
        json.put("address", user.getAddress());
        logger.info("调用用户注册服务......");
        String result = restTemplate.postForObject("http://ZUUL-SERVICE/loginservice/user/register", json.toString(), String.class);
        logger.info("用户注册服务结束，返回值为: {}", result);
    }

}
