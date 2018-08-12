package cn.com.bosssoft.loginmodule.service.impl;

import cn.com.bosssoft.loginmodule.domain.PageContainer;
import cn.com.bosssoft.loginmodule.domain.User;
import cn.com.bosssoft.loginmodule.mapper.UserMapper;
import cn.com.bosssoft.loginmodule.service.UserServer;
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

    //分页逻辑
    @Override
    public PageContainer<User> getUserList(PageContainer<User> pageContainer) {
        List<User> userList = null;
        try {
            //获取记录开始的位置
            int currentIndex = pageContainer.getCurrentPageNo() * pageContainer.getPageSize();
            //SQL => SELECT * FROM user LIMIT #{currentIndex}, #{pageSize}
            userList = userMapper.selectUserList(currentIndex, pageContainer.getPageSize());
            //将查询的List放到分页容器中返回
            pageContainer.setList(userList);
            //再次获取记录总数（前端分页逻辑需要这个字段才能知道有多少页）
            int recordCount = userMapper.selectUserCount();
            pageContainer.setRecordCount(recordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pageContainer;
    }
}


