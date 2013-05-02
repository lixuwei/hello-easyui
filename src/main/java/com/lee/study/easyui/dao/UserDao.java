package com.lee.study.easyui.dao;

import java.util.Map;

import com.lee.study.easyui.basedao.BaseDao;
import com.lee.study.easyui.domain.User;
import com.lee.study.easyui.web.vo.Pagination;
/**
 * @description 用户操作接口
 *
 * @author AlexLee
 * @createTime 2013-4-24 上午10:17:42
 * 
 * @Type com.lee.study.easyui.dao.UserDao
 */
public interface UserDao extends BaseDao<User>{
	/**
	 * 根据Map中的值进行分页查询
	 * @param params
	 * @return
	 */
	Pagination<User> findAllUserByCondition(Map<String, Object> params);
	
	
}
