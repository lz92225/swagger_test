package lz.swagger.controller2;

import io.swagger.annotations.*;
import lz.swagger.pojo.User;
import lz.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by liu_zhang on 2019/11/14 10:27.
 */
@RestController
@RequestMapping("swagger2")
@Api("swagger test controller2") //类的作用
public class SwaggerController2 {

    @Autowired
    UserService userService;

    @PostMapping("user")
    @ApiOperation(value = "return a user", notes = "返回一个固定的用户")
    @ApiResponse(code = 409, message = "错误响应", response = Long.class)
    public User getUser2(){
        return new User().setAge(1)
                .setId(2L)
                .setPassword("password")
                .setUsername("controller2 测试用户")
                .setSex(1);
    }
}
