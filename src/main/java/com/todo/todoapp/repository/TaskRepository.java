package com.todo.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.todoapp.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
