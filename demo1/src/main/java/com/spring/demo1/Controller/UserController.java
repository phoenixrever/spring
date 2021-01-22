package com.spring.demo1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author phoenixhell
 * @create 2021/1/22 0022-下午 12:43
 */
@RestController
public class UserController {
    @GetMapping("/index")
    public String index(){
        return "hello world";
    }
}
