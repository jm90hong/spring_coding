package com.my.spring_coding.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring_coding.vo.Todo;

@Repository
public class TodoDao {

	@Autowired
	SqlSession sqlSession;
	
	public int add(Todo todo) {
		return sqlSession.insert("todo.add",todo);
	}
	
	
	public List<Todo> getAll(){
		return sqlSession.selectList("todo.getAll");
	}
}
