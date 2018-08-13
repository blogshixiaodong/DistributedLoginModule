package cn.com.bosssoft.loginserver.service.impl;

import cn.com.bosssoft.loginserver.domain.User;
import cn.com.bosssoft.loginserver.mapper.UserMapper;
import cn.com.bosssoft.loginserver.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/3 9:31
 */
@Service
public class UserServerImpl implements UserServer {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {
        User user = null;
        try {
            user = userMapper.selectUserById(userId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> userList() {
        try {
            return userMapper.selectUserList(0, 10);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


