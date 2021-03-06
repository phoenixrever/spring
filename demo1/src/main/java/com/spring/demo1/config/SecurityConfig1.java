package com.spring.demo1.config;

import com.spring.demo1.service.serviceImpl.MyPasswordEncoder;
import com.spring.demo1.service.serviceImpl.MyUserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 1:03
 */
//@Configuration
//public class SecurityConfig1 extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private MyUserDetailsServiceImpl myUserDetailsServiceImpl;
////    @Autowired
////    MyPasswordEncoder myPasswordEncoder;
//    @Autowired
//    PasswordEncoder passwordEncoder;
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(myUserDetailsServiceImpl).passwordEncoder(passwordEncoder);
//    }
//}
