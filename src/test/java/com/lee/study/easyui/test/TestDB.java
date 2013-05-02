package com.lee.study.easyui.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestDB {
	
	
	@Test
	public void test(){
		System.out.println("数据库配置好了");
	}
	
	
	
}
