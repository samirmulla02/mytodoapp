package com.spring4sam.mytodoapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.spring4sam.mytodoapp.dao.TodoDao;
import com.spring4sam.mytodoapp.model.Todo;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TodoController {

	private TodoDao myTodoDao;

	public TodoController(TodoDao theTodoDao) {
		myTodoDao = theTodoDao;
	}

	@PostMapping("/addtodo")
	public ResponseEntity<String> addTodo(@RequestBody Todo myTodo) {
		Date tDate = new java.util.Date();
		System.out.println("Date: " + tDate);
		myTodo.setCompleteBy(tDate);
		return ResponseEntity.ok(myTodoDao.addTodo(myTodo));
	}

	@GetMapping("/gettodo")
	public Todo getTodobyId(@RequestBody JsonNode json) {
		return myTodoDao.getTodoById(json.get("todoId").asInt());
	}

	@DeleteMapping("/deletetodo")
	public String deleteTodo(@RequestBody JsonNode json) {
		System.out.println(json);
		return myTodoDao.deleteTodoById(json.get("todoId").asInt());
	}

}
