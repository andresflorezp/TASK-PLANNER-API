package edu.task.planner.TaskPlanner.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.task.planner.TaskPlanner.Implement.UserImplement;
import java.util.*;


import edu.task.planner.TaskPlanner.DTO.Task;
import edu.task.planner.TaskPlanner.DTO.User;
import edu.task.planner.TaskPlanner.Implement.TaskImplement;

@CrossOrigin
@RestController("/")
public class Controller {
	@Autowired
	private TaskImplement taskservice;
	@Autowired
	private UserImplement userservice;
	
	@GetMapping("/get-users")
	public List<User> getAllUsers(){
		return userservice.getUsersList();
	}
	
	@GetMapping("/get-user-id")
	public User getUserId(String id) {
		return userservice.getUserById(id);
	}
	
	@PostMapping("/create-user")
	public void createUserPost(@RequestBody User myuser) {
		userservice.createUser(myuser);
	}
	
	@PutMapping("/update-user")
	public void updateUser(@RequestBody User newUser){
		userservice.updateUser(newUser);
	}
	
	@DeleteMapping("/delete-user")
	public void deleteUser(String id) {
		userservice.removeUser(id);
		
	}
	
	@GetMapping("/get-task")
	public List<Task> getAllTask(){
		return taskservice.geTasksList();
	}
	
	@GetMapping("/get-task-id")
	public Task getTaskId(String id) {
		return taskservice.getTaskById(id);
	}
	
	@GetMapping("/get-tasks-userid")
	public List<Task> getTasksUserId(String id) {
		return taskservice.getTasksByUserId(id);
	}
	
	@GetMapping("/get-tasks-assign-user")
	public Task getTaskAssignUser(String taskId,User user) {
		return taskservice.assignTaskToUser(taskId, user);
	}
	
	@PutMapping("/update-task")
	public void updateTask(@RequestBody Task newTask){
		taskservice.updateTask(newTask);
	}
	
	@DeleteMapping("/delete-task")
	public void deleteTask(String id) {
		taskservice.removeTask(id);
		
	}
	
	@PostMapping("/create-task")
	public void createTask(@RequestBody Task newTask) {
		taskservice.createTask(newTask);
	}
	
	
}
