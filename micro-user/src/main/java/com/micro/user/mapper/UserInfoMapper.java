package com.micro.user.mapper;


import com.micro.domain.entity.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    @Select("select * from userinfo")
    List<UserInfo> findUser();

    @Select("select name from userinfo where id=1")
    String getUser();

    @Insert("insert into userinfo(id,name,age) values(#{id},#{name},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insertUser(UserInfo user);

    @Delete("delete from userinfo where id=#{id}")
    void deleteUser(UserInfo user);

    @Update("update userinfo set name=#{name},age=#{age} where id=#{id}")
    void updateUser(UserInfo user);
}
