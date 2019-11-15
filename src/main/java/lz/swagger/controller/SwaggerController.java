package lz.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
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
@RequestMapping("swagger")
@Api("swagger test controller") //类的作用
public class SwaggerController {

    @Autowired
    UserService userService;

    @PostMapping("test1")
    @ApiOperation(value = "新增一个用户", notes ="新增之后返回该用户" ) //方法说明
    @ApiImplicitParam(paramType = "query", name = "user", value = "用户", required = true) //入参说明
    @ApiResponse(code = 400, message = "参数不对", response = String.class) //响应说明
    public User test1(){
        return userService.getUser();
    }
}
