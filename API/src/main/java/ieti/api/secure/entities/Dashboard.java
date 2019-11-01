package ieti.api.secure.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.*;


public class Dashboard{

    public String name;
    public List<User> members;
    public List<Task> tasks;
    public int id;
    
    
    public Dashboard() {
		// TODO Auto-generated constructor stub
	}
	public Dashboard(String name, List<User> members, List<Task> tasks, int id) {
		super();
		this.name = name;
		this.members = members;
		this.tasks = tasks;
		this.id = id;
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dashboard [name=" + name + ", members=" + members + ", tasks=" + tasks + ", id=" + id + "]";
	}
	

    
}
