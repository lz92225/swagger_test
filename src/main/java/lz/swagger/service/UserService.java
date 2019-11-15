package lz.swagger.service;

import lz.swagger.mapper.UserMapper;
import lz.swagger.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by liu_zhang on 2019/11/14 12:23.
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUser() {
        return userMapper.selectByPrimaryKey((long) 1);
    }

    public User addUser(User user) {
        userMapper.insertSelective(user);
        return user;
    }
}
