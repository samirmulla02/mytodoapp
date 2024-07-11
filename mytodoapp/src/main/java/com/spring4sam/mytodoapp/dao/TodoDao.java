package com.spring4sam.mytodoapp.dao;


import com.spring4sam.mytodoapp.model.Todo;

public interface TodoDao {

	String addTodo(Todo theTodo);

	Todo getTodoById(Integer todoId);
	
	String deleteTodoById(Integer todoId);

}
