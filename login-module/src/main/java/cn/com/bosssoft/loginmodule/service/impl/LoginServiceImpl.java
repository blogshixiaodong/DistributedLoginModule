package cn.com.bosssoft.loginmodule.service.impl;

import cn.com.bosssoft.loginmodule.domain.Account;
import cn.com.bosssoft.loginmodule.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shixiaodong
 * @date 2018/8/11 17:45
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);


    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Boolean loginCheck(Account account) {
        logger.info("调用登陆验证服务......");
        Integer result = restTemplate.postForObject("http://ZUUL-SERVICE/loginservice/user/login", account, Integer.class);
        logger.info("登陆校验服务结束，返回值为: {}", result);

        if(result == 0) {
            return true;
        }
        return false;
    }
}
