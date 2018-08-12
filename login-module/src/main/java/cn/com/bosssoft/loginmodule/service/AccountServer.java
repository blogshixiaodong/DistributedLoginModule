package cn.com.bosssoft.loginmodule.service;


import cn.com.bosssoft.loginmodule.domain.Account;
import cn.com.bosssoft.loginmodule.domain.User;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */

public interface AccountServer {
    /*
    * @Description:
    * @param :  [account, user]
    * @return : void
    */
    void insertAccount(Account account, User user);

}
