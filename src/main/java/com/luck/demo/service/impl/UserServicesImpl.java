package com.luck.demo.service.impl;

import com.luck.demo.entity.user;
import com.luck.demo.mapper.userMapper;
import com.luck.demo.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private userMapper userMapper;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public int login(user user) {


        if (userMapper.login(user) != null) {
            return userMapper.login(user);
        } else {
            return 0;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public String queryPasswordByUsername(String username) {

        return userMapper.queryPasswordByUsername(username);
    }

    @Override
    public List<String> selectRoleByUserName(String username) {
        return userMapper.selectRoleByUserName(userMapper);
    }

    @Transactional
    @Override
    public Integer userRegister(user user) {

        //密码加密
        String password = user.getPassword();
        String encodePassword = bCryptPasswordEncoder.encode(password);
        user.setPassword(encodePassword);
        return userMapper.userRegister(user);

    }

    @Override
    @Transactional(readOnly = true)
    public user checkUsername(String username) {
        return userMapper.checkUsername(username);

    }
}
