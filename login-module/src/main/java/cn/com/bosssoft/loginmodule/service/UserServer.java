package cn.com.bosssoft.loginmodule.service;

import cn.com.bosssoft.loginmodule.domain.PageContainer;
import cn.com.bosssoft.loginmodule.domain.User;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:30
 */
public interface UserServer {

    User getUserById(Integer userId);

    PageContainer<User> getUserList(PageContainer<User> pageContainer);

}
