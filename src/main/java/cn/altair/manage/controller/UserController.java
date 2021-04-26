package cn.altair.manage.controller;

import cn.altair.manage.config.MonitorRequest;
import cn.altair.manage.entity.User;
import cn.altair.manage.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The entrance about user
 *
 * @Author Altair Yan
 * @Since 1.0.0
 */
@Api(value = "user login", tags = "user login")
@Controller
@ResponseBody
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @MonitorRequest
    @PostMapping("/login")
    @ApiOperation(value = "user login", tags = "user login", notes = "maximum 5 consecutive mistakes")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "username", type = "user", required = true),
            @ApiImplicitParam(name = "password", value = "password", type = "user", required = true)
    })
    public String login(User user) {
        Integer login = userService.login(user);
        if (login > 0) {
            return "login success";
        } else {
            return "login fail";
        }
    }
}
