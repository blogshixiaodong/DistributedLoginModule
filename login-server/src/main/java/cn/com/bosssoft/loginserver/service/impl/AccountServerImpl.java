package cn.com.bosssoft.loginserver.service.impl;

import cn.com.bosssoft.loginserver.domain.Account;
import cn.com.bosssoft.loginserver.domain.User;
import cn.com.bosssoft.loginserver.mapper.AccountMapper;
import cn.com.bosssoft.loginserver.mapper.UserMapper;
import cn.com.bosssoft.loginserver.service.AccountServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:33
 */
@Service
public class AccountServerImpl implements AccountServer {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertAccount(Account account, User user) {
        try {
            userMapper.insertUser(user);
            account.setUserId(user.getUserId());
            accountMapper.insertAccount(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean loginCheck(Account checkAccount) {
        Account account = accountMapper.selectAccountById(checkAccount.getAccountId());
        if(checkAccount.equals(account)) {
            return true;
        }
        return false;
    }
}
