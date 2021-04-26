package cn.altair.manage.config;

import java.lang.annotation.*;

/**
 * The annotation use for aop about UserController
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MonitorRequest {
}
