package ieti.api.secure.entities;


import java.util.*;

public class User{
    private String name;
    private String email;
    private String userName;
    private String initials;
    private String password;
    private List<Dashboard> dashboards = new ArrayList<>();
    private List<Team> teams = new ArrayList<>();
    
    
    public User() {
    	
    }
    
	public User(String name, String email, String userName, String initials, String password,
			List<Dashboard> dashboards, List<Team> teams) {
		super();
		this.name = name;
		this.email = email;
		this.userName = userName;
		this.initials = initials;
		this.password = password;
		this.dashboards = dashboards;
		this.teams = teams;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", userName=" + userName + ", initials=" + initials
				+ ", password=" + password + ", dashboards=" + dashboards + ", teams=" + teams + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Dashboard> getDashboards() {
		return dashboards;
	}
	public void setDashboards(List<Dashboard> dashboards) {
		this.dashboards = dashboards;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
    
    
    
}