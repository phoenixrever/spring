package com.spring.demo1;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.spring.demo1.mapper")
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Demo1Application.class, args);
		String[] arr=new String[]{"123,456,789"};

		//数组转为带逗号的字符串
		String anyAuthorities = StringUtils.arrayToDelimitedString(arr, "','");
		System.out.println(anyAuthorities);
	}
}
