package cn.altair.manage.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * The entity about users
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
@Getter
@Setter
public class User {

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private Integer password;

    /**
     * the user login input password mistake count
     */
    private Integer loginInputCount;

}
