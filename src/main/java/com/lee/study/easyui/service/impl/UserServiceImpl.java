package com.lee.study.easyui.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.study.easyui.dao.UserDao;
import com.lee.study.easyui.domain.User;
import com.lee.study.easyui.service.UserService;
import com.lee.study.easyui.web.vo.Pagination;
/**
 * @description
 * 
 * @author lee
 * @createTime 2013-4-24 下午2:15:57 
 *
 * @Type com.lee.study.easyui.service.impl.UserServiceImpl
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public Pagination<User> findAllUser(int pageNumber,int pageSize) {
		
		Pagination<User> pagination = userDao.findAllUser(pageNumber, pageSize);
		
		return pagination;
	}

	@Override
	public boolean save(User user) {
		
		boolean flag = false;
		if(userDao.add(user) != 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag = false;
		if(userDao.update(user) != 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean deleteUserById(int id) {
		boolean flag = false;
		if(userDao.delete(id) != 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public Pagination<User> findAllUserBySearch(int pageNumber, int pageSize,
			String firstname, String lastname) {
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("pageStart", (pageNumber-1)*pageSize+1);
		params.put("pageEnd", pageNumber*pageSize);
		
		params.put("firstname", "%"+firstname+"%");
		params.put("lastname", "%"+lastname+"%");
		
		Pagination<User> pagination = userDao.findAllUserByCondition(params);
		
		return pagination;
	}

}
