package com.luck.demo.service;

import com.luck.demo.entity.user;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServices {
    int login(user user);

    String queryPasswordByUsername(String username);

    List<String> selectRoleByUserName(String username);

    Integer userRegister(user user);

    user checkUsername(String username);
}
