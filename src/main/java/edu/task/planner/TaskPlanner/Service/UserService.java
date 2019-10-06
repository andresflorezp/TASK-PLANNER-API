package edu.task.planner.TaskPlanner.Service;

import java.util.List;

import edu.task.planner.TaskPlanner.DTO.User;

public interface UserService {
	List<User> getUsersList();
    
    User getUserById(String userId);
    
    User createUser(User user);
    
    User updateUser(User user);
    
    void removeUser(String userId);

}
