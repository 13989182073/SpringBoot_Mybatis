package com.luck.demo.mapper;

import com.luck.demo.entity.user;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface userMapper extends Mapper<user> {
    Integer login(user user);

    String queryPasswordByUsername(String username);

    List<String> selectRoleByUserName(userMapper userMapper);

    Integer userRegister(user user);

    user checkUsername(String username);
}