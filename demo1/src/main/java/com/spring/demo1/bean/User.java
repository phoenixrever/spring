package com.spring.demo1.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 2:21
 */
@Data
@NoArgsConstructor
@TableName("users")
public class User {
    private Integer id;
    private String username;
    private String password;
}
