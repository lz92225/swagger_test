package lz.swagger.mapper;

import lz.swagger.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * create by liu_zhang on 2019/11/14 12:11.
 */
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from `user` where id = #{id}")
    User selectById(long id);
}