package com.lee.study.easyui.basedao;

import com.lee.study.easyui.web.vo.Pagination;

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
	public int add(T entity);
	/**
	 * 更新一个实体
	 * @param entity
	 */
	public int update(T entity);
	/**
	 * 根据ID删除一个实体
	 * @param id 
	 * @return 受影响的条数
	 */
	public int delete(int id);
	/**
	 * 根据ID获取一个实体对象
	 * @param id
	 * @return
	 */
	public T load(int id);
	/**
	 * 查询出所有的实体记录放入分页实体中
	 * @return
	 */
	public Pagination<T> findAllUser(int pageNumber,int pageSize);
	
}
