package cn.com.bosssoft.loginserver.mapper;


import cn.com.bosssoft.loginserver.domain.User;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

/**
 * @author Shixiaodong
 * @date 2018/8/1 16:15
 */
public interface UserMapper {

    List<User> selectUserList(@Param("currentIndex") int currentIndex, @Param("pageSize") int pageSize) throws IOException;

    User selectUserById(Integer userId) throws IOException;

    /*
    * @Description: 插入用户信息
    * @param :  [user]
    * @return : Integer
    */
    Integer insertUser(User user) throws IOException;

    Integer selectUserCount() throws IOException;

}
