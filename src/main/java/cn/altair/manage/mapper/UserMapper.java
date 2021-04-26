package cn.altair.manage.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * The mapper between UserService and UserMapper.xml
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
@Mapper
public interface UserMapper {
    /**
     * get username
     *
     * @return username
     */
    String login();
}
