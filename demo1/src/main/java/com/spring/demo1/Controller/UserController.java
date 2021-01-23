package com.spring.demo1.Controller;

import com.spring.demo1.bean.User;
import com.spring.demo1.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 12:43
 */

@Controller
public class UserController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }

    @GetMapping("/annotation")
    @ResponseBody
    //角色认证 roles
    @Secured(value = {"ROLE_role"})
    //权限认证  permissions
    @PreAuthorize("hasAnyAuthority('auth,admin,shadow')")
//    @PreAuthorize("hasAnyRole('roles')")
    // 方法之后调用
    @PostAuthorize("hasRole('return')")
    public String testSecurity(){
        System.out.println("someone coming");
        return "annotation";
    }

    @Autowired
    UserServiceImpl userServiceimpl;
    @GetMapping("/users")
    @ResponseBody
    //进入控制器之前对数据进行过滤
//    @PreFilter("filterObject.id=='1'")
    //权限验证之后对数据进行过滤 留下用户名是 admin1 的数据
//    @PostFilter("filterObject.username=='admin'")
    public List<User> getUsers(){
        List<User> list = userServiceimpl.query().list();
        return list;
    }
}
