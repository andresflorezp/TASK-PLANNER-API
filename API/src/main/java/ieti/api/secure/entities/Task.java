package ieti.api.secure.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


public class Task{
    private List<User> members = new ArrayList<>();
    private List<Comment> comments  = new ArrayList<>();
    private State state; 
    private Label label;
    private Date expirationDate;
    private String name;
    private String description;
    private String id;
    
    
    public Task() {
		// TODO Auto-generated constructor stub
	}
    
	public Task(List<User> members, List<Comment> comments, State state, Label label, Date expirationDate, String name,
			String description, String id) {
		super();
		this.members = members;
		this.comments = comments;
		this.state = state;
		this.label = label;
		this.expirationDate = expirationDate;
		this.name = name;
		this.description = description;
		this.id = id;
	}

	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Task [members=" + members + ", comments=" + comments + ", state=" + state + ", label=" + label
				+ ", expirationDate=" + expirationDate + ", name=" + name + ", description=" + description + ", id="
				+ id + "]";
	}
	
    
    
}
