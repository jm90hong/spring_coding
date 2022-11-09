package com.my.spring_coding.vo;

public class Todo {
	
	
	private int todo_idx=0;
	private String name=null;
	private String title=null;
	private String type=null;
	private String importance=null;
	private String complete_ny=null;
	private String created_date=null;
	public int getTodo_idx() {
		return todo_idx;
	}
	public void setTodo_idx(int todo_idx) {
		this.todo_idx = todo_idx;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImportance() {
		return importance;
	}
	public void setImportance(String importance) {
		this.importance = importance;
	}
	public String getComplete_ny() {
		return complete_ny;
	}
	public void setComplete_ny(String complete_ny) {
		this.complete_ny = complete_ny;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
	
}
