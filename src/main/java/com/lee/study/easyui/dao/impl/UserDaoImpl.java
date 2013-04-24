package com.lee.study.easyui.dao.impl;

import org.springframework.stereotype.Repository;

import com.lee.study.easyui.basedao.impl.BaseDaoImpl;
import com.lee.study.easyui.dao.UserDao;
import com.lee.study.easyui.domain.User;
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

}
