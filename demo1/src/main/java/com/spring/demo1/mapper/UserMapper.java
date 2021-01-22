package com.spring.demo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.demo1.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 2:06
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    User customXml(String id);
}
