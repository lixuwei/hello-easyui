package com.lee.study.easyui.basedao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.lee.study.easyui.basedao.BaseDao;
import com.lee.study.easyui.web.vo.Pagination;
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
	
	protected Class<T> clazz = null;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = this.getClass().getGenericSuperclass();
		if(type instanceof ParameterizedType){
			ParameterizedType pType = (ParameterizedType) type;
			clazz = (Class<T>) pType.getActualTypeArguments()[0];
		}
	}

	@Override
	public int add(T entity) {
		int insert = sessionTemplate.insert(clazz.getName()+".add",entity);
		return insert;
	}

	@Override
	public int update(T entity) {
		int update = sessionTemplate.update(clazz.getName()+".update", entity);
		return update;
	}

	@Override
	public int delete(int id) {
		int delete = sessionTemplate.delete(clazz.getName()+".delete", id);
		return delete;
	}
	
	@Transactional(readOnly=true)
	@Override
	public T load(int id) {
		return sessionTemplate.selectOne(clazz.getName()+".load",id);
	}
	@Transactional(readOnly=true)
	@Override
	public Pagination<T> findAllUser(int pageNumber,int pageSize) {
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("pageStart", (pageNumber-1)*pageSize+1);
		params.put("pageEnd", pageNumber*pageSize);
		
		int total = sessionTemplate.selectOne(clazz.getName()+".total");
		
		List<T> rows = sessionTemplate.selectList(clazz.getName()+".pagination",params);
		
		return new Pagination<T>(total,rows);
	}
}
