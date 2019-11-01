package ieti.api.secure.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;


public class Team{

    private List<User> members;
    private List<Dashboard> dashboard;
    private String name;
    private String description;
    
    
    public Team() {
		// TODO Auto-generated constructor stub
	}
    
	public Team(List<User> members, List<Dashboard> dashboard, String name, String description) {
		super();
		this.members = members;
		this.dashboard = dashboard;
		this.name = name;
		this.description = description;
	}

	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public List<Dashboard> getDashboard() {
		return dashboard;
	}
	public void setDashboard(List<Dashboard> dashboard) {
		this.dashboard = dashboard;
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

	@Override
	public String toString() {
		return "Team [members=" + members + ", dashboard=" + dashboard + ", name=" + name + ", description="
				+ description + "]";
	}
	
    
    

}