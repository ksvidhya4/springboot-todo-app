package com.todo.todoapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.todoapp.models.Task;
import com.todo.todoapp.repository.TaskRepository;

@Service
public class TaskService {

	private final TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository=taskRepository;
	}
	
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
		
	}

	public void createTask(String title) {
		// TODO Auto-generated method stub
		Task task=new Task();
		task.setTitle(title);
		task.setCompleted(false);
		taskRepository.save(task);
	}

	public void deleteTask(Long id) {
		// TODO Auto-generated method stub
		taskRepository.deleteById(id);
		
	}

	public void ToggleTask(Long id) {
		// TODO Auto-generated method stub
		Task task=taskRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid task id"));
		task.setCompleted(!task.isCompleted());
		taskRepository.save(task);
	}

	
	

}
