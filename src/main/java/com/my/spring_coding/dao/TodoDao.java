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
	
	public int delete(Todo todo) {
		return sqlSession.delete("todo.delete",todo);
	}
	
	public int updateComplete(Todo todo) {
		return sqlSession.update("todo.udpate",todo);
	}
	
	public Todo getByIdx(Todo todo) {
		return sqlSession.selectOne("todo.getByIdx",todo);
	}
}
