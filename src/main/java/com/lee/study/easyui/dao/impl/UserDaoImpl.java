package com.lee.study.easyui.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lee.study.easyui.basedao.impl.BaseDaoImpl;
import com.lee.study.easyui.dao.UserDao;
import com.lee.study.easyui.domain.User;
import com.lee.study.easyui.web.vo.Pagination;
/**
 * @description 用户实体的具体操作类
 *
 * @author AlexLee
 * @createTime 2013-4-24 上午10:18:31
 * 
 * @Type com.lee.study.easyui.dao.impl.UserDaoImpl
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public Pagination<User> findAllUserByCondition(Map<String, Object> params) {
		
		Pagination<User> pagination = new Pagination<User>();
		
		if (params!=null) {
			
			int total = this.sessionTemplate.selectOne(this.clazz.getName()+".totalByCondition", params);
			pagination.setTotal(total);
			List<User> rows = this.sessionTemplate.selectList(this.clazz.getName()+".findUserByCondition",params);
			pagination.setRows(rows);
		}
		
		return pagination;
	}

}
