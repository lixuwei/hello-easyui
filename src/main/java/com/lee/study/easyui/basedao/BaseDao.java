package com.lee.study.easyui.basedao;
/**
 * @description 公用的方法接口
 *
 * @author AlexLee
 * @createTime 2013-4-24 上午9:38:34
 * 
 * @Type com.lee.study.easyui.basedao.BaseDao
 */
public interface BaseDao<T> {

	/**
	 * 增加一个实体
	 * @param entity
	 */
	public void add(T entity);
	/**
	 * 更新一个实体
	 * @param entity
	 */
	public void update(T entity);
	/**
	 * 根据ID删除一个实体
	 * @param id
	 */
	public void delete(int id);
	/**
	 * 根据ID获取一个实体对象
	 * @param id
	 * @return
	 */
	public T load(int id);
	
}
