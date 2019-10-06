package edu.task.planner.TaskPlanner.DTO;

public class Task {
	private String Id;
	private String description;
	private User responsable;
	private String status;
	private String dueDate;
	
	
	public Task() {
		// TODO Auto-generated constructor stub
	}
	public Task(String id, String description, User responsable, String status, String dueDate) {
		super();
		Id = id;
		this.description = description;
		this.responsable = responsable;
		this.status = status;
		this.dueDate = dueDate;
	}

	public Task(String description, User responsable, String status, String dueDate) {
		super();
		this.description = description;
		this.responsable = responsable;
		this.status = status;
		this.dueDate = dueDate;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getResponsable() {
		return responsable;
	}
	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
	

}
