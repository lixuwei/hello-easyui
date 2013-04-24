package com.lee.study.easyui.basedao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.lee.study.easyui.basedao.BaseDao;
/**
 * @description 公共的数据库操作类
 *
 * @author AlexLee
 * @createTime 2013-4-24 上午10:07:09
 * 
 * @Type com.lee.study.easyui.basedao.impl.BaseDaoImpl
 */
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Resource
	protected SqlSessionTemplate sessionTemplate;
	
	private Class<T> clazz = null;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = this.getClass().getGenericSuperclass();
		if(type instanceof ParameterizedType){
			ParameterizedType pType = (ParameterizedType) type;
			clazz = (Class<T>) pType.getActualTypeArguments()[0];
		}
	}

	@Override
	public void add(T entity) {
		sessionTemplate.insert(clazz.getName()+".add",entity);
	}

	@Override
	public void update(T entity) {
		sessionTemplate.update(clazz.getName()+".update", entity);
	}

	@Override
	public void delete(int id) {
		sessionTemplate.delete(clazz.getName()+".delete", id);
	}
	
	@Transactional(readOnly=true)
	@Override
	public T load(int id) {
		return sessionTemplate.selectOne(clazz.getName()+".load",id);
	}
}
