package lz.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lz.swagger.pojo.User;
import lz.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by liu_zhang on 2019/11/14 18:33.
 */
@RestController
@RequestMapping("swagger3")
@Api(value = "swagger测试API")
public class TestController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    @ApiOperation(value = "新增用户", notes = "前段传递用户信息，后台存到数据库")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
