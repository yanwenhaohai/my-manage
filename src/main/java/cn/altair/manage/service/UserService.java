package cn.altair.manage.service;

import cn.altair.manage.entity.User;

/**
 * Interface about user's logic
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
public interface UserService {
    /**
     * get username
     *
     * @return username
     */

    Integer login(User user);
}
