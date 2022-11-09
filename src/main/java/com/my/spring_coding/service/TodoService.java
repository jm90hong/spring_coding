package com.my.spring_coding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.spring_coding.dao.TodoDao;
import com.my.spring_coding.vo.Todo;

@Service
public class TodoService {
	
	
	@Autowired
	TodoDao todoDao;
	
	
	public int add(Todo todo) {
		return todoDao.add(todo);
	}
	
	public List<Todo> getAll(){
		return todoDao.getAll();
	}
	
	public int delete(Todo todo) {
		return todoDao.delete(todo);
	}
	
	public int updateComplete(Todo todo) {
		return todoDao.updateComplete(todo);
	}
	
	public Todo getByIdx(Todo todo) {
		return todoDao.getByIdx(todo);
	}
	
}