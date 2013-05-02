package com.lee.study.easyui.domain;
/**
 * Tree 的实体
 * @author AlexLee
 */
public class Tree {

	private int id;
	private String text;
	private int parentId;
	private int isParent;
	
	public Tree() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getIsParent() {
		return isParent;
	}

	public void setIsParent(int isParent) {
		this.isParent = isParent;
	}
	
	
}
