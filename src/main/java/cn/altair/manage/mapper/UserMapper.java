package cn.altair.manage.mapper;

import cn.altair.manage.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    Integer login(@Param("user") User user);
}
