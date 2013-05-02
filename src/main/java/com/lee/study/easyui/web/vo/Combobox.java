package com.lee.study.easyui.web.vo;

public class Combobox {

	private int id = 0;
	private String text="";
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
	public Combobox() {
		super();
	}
	public Combobox(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	
	
	
}
