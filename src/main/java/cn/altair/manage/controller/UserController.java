package cn.altair.manage.controller;

import cn.altair.manage.config.MonitorRequest;
import cn.altair.manage.entity.User;
import cn.altair.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The entrance about user
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @MonitorRequest
    @PostMapping("/login")
    public String login(User user) {
        String login = userService.login();
        if (login != null) {
            return "login success";
        } else {
            return "login fail";
        }
    }
}
