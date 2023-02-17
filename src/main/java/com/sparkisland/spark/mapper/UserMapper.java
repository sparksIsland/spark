package com.sparkisland.spark.mapper;

import com.sparkisland.spark.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM sys_user")
    List<User> findAll();
}
