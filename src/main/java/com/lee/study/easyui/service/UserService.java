package com.lee.study.easyui.service;

import com.lee.study.easyui.domain.User;
import com.lee.study.easyui.web.vo.Pagination;

public interface UserService {
	
	/**
	 * 查询表中所有的用户记录
	 * @param pageNumber 页码
	 * @param pageSize   显示条数
	 * @return
	 */
	Pagination<User> findAllUser(int pageNumber,int pageSize);
	/**
	 * 添加一个用户
	 * @param user
	 * @return
	 */
	boolean save(User user);
	/**
	 * 更新一个用户信息
	 * @param user
	 */
	boolean updateUser(User user);
	/**
	 * 根据id删除用户
	 * @param id
	 */
	boolean deleteUserById(int id);
	/**
	 * 通过firstName,lastName来查询用户信息
	 * @param page
	 * @param rows
	 * @param firstname
	 * @param lastname
	 * @return
	 */
	Pagination<User> findAllUserBySearch(int page, int rows, String firstname,
			String lastname);

}
