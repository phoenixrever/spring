package com.spring.demo1.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spring.demo1.bean.User;
import com.spring.demo1.mapper.UserMapper;
import com.spring.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 2:49
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    public void customXml(String id){
        userMapper.customXml(id);
    }
}
