package com.spring.securitydemo1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author phoenixhell
 * @created 2021/1/21 0021-下午 4:04
 */
@Controller
@RequestMapping("/test")
public class HelloWorld {
    @GetMapping("/hello")
    @ResponseBody
    public String index(){
        return "hello security!";
    }
}
