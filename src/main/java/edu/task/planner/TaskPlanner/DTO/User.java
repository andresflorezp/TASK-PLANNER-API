package edu.task.planner.TaskPlanner.DTO;

import java.util.List;

public class User {
	private String Id;
	private String fullName;
	private String email;
	private String password;
	private List<Task> tasks;
	
	public User() {
		super();
	}
	
	public User(String id, String fullName, String email, String password, List<Task> tasks) {
		super();
		Id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.tasks = tasks;
	}

	public User(String id, String fullName, String email, String password) {
		super();
		Id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public User(String fullName, String email, String password) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}
	
	public User(String fullName, String email) {
		super();
		this.fullName = fullName;
		this.email = email;
	}
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
