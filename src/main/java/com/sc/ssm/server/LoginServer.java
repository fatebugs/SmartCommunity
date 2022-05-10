package com.sc.ssm.server;

import com.sc.ssm.dao.UserMapper;
import com.sc.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author XINSHA-FU
 * @Create 2022/3/17 22:57
 */
@Service
public class LoginServer {

    @Autowired
    UserMapper userMapper;

    public User selectOne(User user){

        List<User> userList = userMapper.selectOneByUserName(user.getUserName());

        // 对用户名和密码进行判断
        for (User us : userList) {
            if (us!=null){
                    if (us.getUserPass().equals(user.getUserPass())){
                        return us;
                    }
            }
        }
        return null;
    }
}
