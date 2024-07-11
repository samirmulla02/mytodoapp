package com.spring4sam.mytodoapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring4sam.mytodoapp.model.Todo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class TodoDaoImpl implements TodoDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public String addTodo(Todo theTodo) {
		entityManager.persist(theTodo);
		return "Todo Added...";
	}

	@Override
	public Todo getTodoById(Integer todoId) {
		return entityManager.find(Todo.class, todoId);
	}

	@Override
	@Transactional
	public String deleteTodoById(Integer todoId) {
		if (getTodoById(todoId) != null) {
			entityManager.remove(getTodoById(todoId));
		} else {
			return "no todo found";
		}
		return "todo deleted ... ";
	}

}
