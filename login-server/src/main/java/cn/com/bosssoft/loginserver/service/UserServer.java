package cn.com.bosssoft.loginserver.service;


import cn.com.bosssoft.loginserver.domain.User;

import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:30
 */
public interface UserServer {

    User getUserById(Integer userId);

    List<User> userList();

}
