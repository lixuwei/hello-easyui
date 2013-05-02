package com.lee.study.easyui.web.vo;

import java.util.List;

/**
 * @description 分页VO
 * 
 * @author lee
 * @createTime 2013-4-24 下午2:09:08 
 *
 * @Type com.lee.study.easyui.web.vo.Pagination
 */
public class Pagination<T> {

	private int total;
	
	private List<T> rows;
	
	
	public Pagination() {
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Pagination(int total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	
}
