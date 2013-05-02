package com.lee.study.easyui.web.vo;
/**
 * 页面上要显示的节点
 * @author AlexLee
 */
public class TreeNode {

	private int id;
	private String text;
	private String state;
	
	public TreeNode() {
	}
	
	public TreeNode(int id, String text, String state) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
