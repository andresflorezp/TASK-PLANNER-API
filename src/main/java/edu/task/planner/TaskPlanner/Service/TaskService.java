package edu.task.planner.TaskPlanner.Service;
import java.util.*;

import edu.task.planner.TaskPlanner.DTO.Task;
import edu.task.planner.TaskPlanner.DTO.User;
public interface TaskService {
	List<Task> geTasksList();
    
    Task getTaskById(String id);
    
    List<Task> getTasksByUserId(String userId);
    
    Task assignTaskToUser(String taskId, User user);
    
    void removeTask(String taskId);
    
    Task updateTask(Task task);
    
    void createTask(Task task);

}
