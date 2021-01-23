package com.spring.demo1;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class Demo1ApplicationTests {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//注册 JdbcTokenRepositoryImpl

	@Autowired
	private DruidDataSource druidDataSource;

	@Test
	void contextLoads() {
		// 查看配置数据源信息
		System.out.println(jdbcTemplate);
		System.out.println(druidDataSource.getClass().getName());
	}

}
