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
        List<GrantedAuthority> role = AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
//        System.out.println(new BCryptPasswordEncoder().encode("1234"));
        return  new org.springframework.security.core.userdetails.User(user.getUsername(),new BCryptPasswordEncoder().encode(user.getPassword()),role);
    }
}


