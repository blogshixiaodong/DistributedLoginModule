package cn.com.bosssoft.loginmodule.service;

import cn.com.bosssoft.loginmodule.domain.Account;

/**
 * @author Shixiaodong
 * @date 2018/8/11 17:45
 */
public interface LoginService {

    Boolean loginCheck(Account account);

}
