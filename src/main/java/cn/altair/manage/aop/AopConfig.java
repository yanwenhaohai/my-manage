package cn.altair.manage.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * The aop about userController
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
@Aspect
@Component
public class AopConfig {

    /**
     * aop before annotation MonitorRequest
     */
    @Before(value = "@annotation(cn.altair.manage.config.MonitorRequest)")
    public void beforeUserAop() {
        System.out.println("aop before user login");
    }

    @After(value = "@annotation(cn.altair.manage.config.MonitorRequest)")
    public void aroundUserAop() {
        System.out.println("aop after user login");
    }
}
