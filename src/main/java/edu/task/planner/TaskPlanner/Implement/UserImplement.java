package edu.task.planner.TaskPlanner.Implement;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.users.MemoryUser;
import org.springframework.stereotype.Service;

import edu.task.planner.TaskPlanner.DTO.Task;
import edu.task.planner.TaskPlanner.DTO.User;
import edu.task.planner.TaskPlanner.Service.UserService;

@Service
public class UserImplement implements UserService{
	public static List<User> MemoUsers = new ArrayList<User>();
	
	public UserImplement() {
		// TODO Auto-generated constructor stub
		List<Task> tasks = new ArrayList<>();
		tasks.add(new Task("1", "completa",new User(), "process","13-08-2019"));
		MemoUsers.add(new User("1", "Andres", "anflo.97", "123",tasks));
	}
	
	@Override
	public List<User> getUsersList() {
		// TODO Auto-generated method stub
		return MemoUsers;
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		for(User u:MemoUsers) {
			if(u.getId().equals(userId))return u;
		}
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		MemoUsers.add(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		for(int i=0;i<MemoUsers.size();i++) {
			if(MemoUsers.get(i).getId().equals(user.getId())) {
				MemoUsers.remove(i);
				MemoUsers.add(user);
				return user;
			}
		}
		return null;
	}

	@Override
	public void removeUser(String userId) {
		// TODO Auto-generated method stub
		for(int i=0;i<MemoUsers.size();i++) {
			if(MemoUsers.get(i).getId().equals(userId)) {
				MemoUsers.remove(i);
				
				
			}
		}
		
	}

}
