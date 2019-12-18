package com.luck.demo.config;

import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import com.luck.demo.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserDetailServiceImpl implements UserDetailsService {
    @Resource
    private UserServices userServices;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String  = bCryptPasswordEncoder.encode("123456");
        String password = userServices.queryPasswordByUsername(username);

        return new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList("root"));
    }
}