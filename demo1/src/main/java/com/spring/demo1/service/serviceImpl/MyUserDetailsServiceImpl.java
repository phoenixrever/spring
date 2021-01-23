package com.spring.demo1.service.serviceImpl;
import com.spring.demo1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 2:10
 */
@Service
public class MyUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user= userServiceImpl.query().eq("username", s).one();
        if(user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }

        //role 和 权限都可以 role可以有多个权限
        //ROLE_  前缀不能少要和权限区分
        List<GrantedAuthority> role = AuthorityUtils.commaSeparatedStringToAuthorityList("admin,auth,ROLE_role");
        return  new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),role);
    }
}


