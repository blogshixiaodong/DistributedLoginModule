package cn.com.bosssoft.loginserver.mapper;


import cn.com.bosssoft.loginserver.domain.Account;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:10
 */
public interface AccountMapper {

    /*
    * @Description:添加账户
    * @param :  [account]
    * @return : void
    */
    void insertAccount(Account account);

    Account selectAccountById(Integer accountId);

}
