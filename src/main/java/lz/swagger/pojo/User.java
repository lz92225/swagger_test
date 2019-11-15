package lz.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * create by liu_zhang on 2019/11/14 11:57.
 */
@ApiModel
public class User {

    @ApiModelProperty(hidden = true)
    private Long id;

    @ApiModelProperty(value = "年龄(必填)", required = true)
    private Integer age;

    @ApiModelProperty(value = "密码(必填)", required = true)
    private String password;

    @ApiModelProperty(value = "性别(必填)", required = true)
    private Integer sex;

    @ApiModelProperty(value = "用户名(必填)", required = true)
    private String username;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public User setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", password='").append(password).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", username='").append(username).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //    private Address address;
}