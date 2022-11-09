package com.my.spring_coding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.spring_coding.service.TodoService;
import com.my.spring_coding.vo.Todo;



@Controller
public class HomeController {
	
	
	@Autowired
	TodoService todoService;
	
	@GetMapping(value="/")
	public  String home() {
		
		return "home";
	}
	
	@GetMapping(value="/add_todo")
	public  String add_todo() {
		
		
		return "add-todo";
	}
	
	
	
	@GetMapping(value="/detail_todo")
	public  String detail_todo(
			@RequestParam(value="todo_idx") int todo_idx,
			Model model
		) {
		
		Todo todo = new Todo();
		todo.setTodo_idx(todo_idx);
		
		Todo result = todoService.getByIdx(todo);
		model.addAttribute("todo",result);
		
		
		return "detail-todo";
	}
}
