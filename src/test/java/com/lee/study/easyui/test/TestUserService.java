package com.lee.study.easyui.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lee.study.easyui.domain.User;
import com.lee.study.easyui.service.UserService;
import com.lee.study.easyui.web.vo.Pagination;

/**
 * @description 测试UserService
 * 
 * @author lee
 * @createTime 2013-4-24 下午4:18:18 
 *
 * @Type com.lee.study.easyui.test.TestUserService
 */
public class TestUserService extends TestDB{
	
	@Autowired
	private UserService userService;

	@Test
	public void TestSave(){
		
		for (int i = 1; i < 20; i++) {
			User user = new User();
			user.setEmail("lixuweiok@163.com");
			user.setFirstname("xuwei"+i);
			user.setLastname("lee");
			user.setPhone("1212112");
			
			assertTrue("保存成功",userService.save(user));
			
		}
		
		/*User user = new User();
		user.setEmail("lixuweiok@163.com");
		user.setFirstname("xuwei");
		user.setLastname("lee");
		user.setPhone("1212112");
		
		assertTrue("保存成功",userService.save(user));
		*/
		
		
	}
	@Test
	public void testFindAll(){
		Pagination<User> pagination = userService.findAllUser(1, 3);
		for (User user : pagination.getRows()) {
			System.out.println(user.getFirstname());
		}
	}
	
	@Test
	public void testFindAllByCondition(){
		Pagination<User> pagination = userService.findAllUserBySearch(1, 10, "xu","l");
		for (User user : pagination.getRows()) {
			System.err.println(user.getFirstname()+"=="+user.getLastname());
		}
	}
}
