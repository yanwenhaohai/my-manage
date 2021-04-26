package cn.altair.manage.service.impl;

import cn.altair.manage.mapper.UserMapper;
import cn.altair.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Deal with user's logic
 *
 * @Authore Altair Yan
 * @Since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * get username
     * @return username
     */
    @Override
    public String login() {
        return userMapper.login();
    }
}
