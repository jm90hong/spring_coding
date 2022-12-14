package com.my.spring_coding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.spring_coding.service.TodoService;
import com.my.spring_coding.vo.Todo;



@Controller
@RequestMapping("/todo")
public class TodoController {
	
	
	@Autowired
	TodoService todoService;
	
	
	@GetMapping("/all")
	public @ResponseBody List<Todo> all(){
		
		List<Todo> list = todoService.getAll();
		
		return list;
	}
	
	
	@PostMapping("/delTodo")
	public @ResponseBody String delTodo(
				@RequestParam(value="todo_idx") int todo_idx
			){
			
		Todo todo = new Todo();
		todo.setTodo_idx(todo_idx);
	
		
		todoService.delete(todo);
		
		return "ok";
	}
	
	
	@PostMapping("/updateComplete")
	public @ResponseBody String updateComplete(
				@RequestParam(value="todo_idx") int todo_idx,
				@RequestParam(value="ny") String ny
			){
			
		Todo todo = new Todo();
		todo.setTodo_idx(todo_idx);
		todo.setComplete_ny(ny);
		
		todoService.updateComplete(todo);
		
		return "ok";
	}
	
	@PostMapping("/add")
	public @ResponseBody  String add(
				@RequestParam(value="name") String name,
				@RequestParam(value="type") String type,
				@RequestParam(value="title") String title,
				@RequestParam(value="im") String importance
			) {
		
		
		Todo todo = new Todo();
		
		todo.setName(name);
		todo.setType(type);
		todo.setTitle(title);
		todo.setImportance(importance);
		
		
		todoService.add(todo);
		
		return "ok";
		
		
	}
}
