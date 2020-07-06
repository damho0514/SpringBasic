package com.simple.command;



public class BoardVO {
	
	private String name;
	private String title;
	private String content;
	private int num;
	
	public BoardVO() {}
	
	public BoardVO(String name, String title, String content, int num) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

	

	
	
	
	
	
}
