package com.spring4sam.mytodoapp.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "todo_id")
	private Integer todoId;

	@Column(name = "todo_name")
	private String todoName;

	@Column(name = "todo_desc")
	private String todoDesc;

	@Column(name = "complete_by")
	private Date completeBy;

	public Todo() {
		// TODO Auto-generated constructor stub
	}

	public Todo(String todoName, String todoDesc, Date completeBy, String createdBy, Date createdDate) {
		super();
		this.todoName = todoName;
		this.todoDesc = todoDesc;
		this.completeBy = completeBy;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public Integer getTodoId() {
		return todoId;
	}

	public void setTodoId(Integer todoId) {
		this.todoId = todoId;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public String getTodoDesc() {
		return todoDesc;
	}

	public void setTodoDesc(String todoDesc) {
		this.todoDesc = todoDesc;
	}

	public Date getCompleteBy() {
		return completeBy;
	}

	public void setCompleteBy(Date completeBy) {
		this.completeBy = completeBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

}
