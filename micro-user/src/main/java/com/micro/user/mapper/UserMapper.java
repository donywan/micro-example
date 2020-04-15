package com.micro.user.mapper;


import com.micro.domain.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findUser();

    @Select("select name from user where id=1")
    String getUser();

    @Insert("insert into user(id,name,age) values(#{id},#{name},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insertUser(User user);

    @Delete("delete from user where id=#{id}")
    void deleteUser(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateUser(User user);
}
