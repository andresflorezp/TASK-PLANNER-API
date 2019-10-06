package edu.task.planner.TaskPlanner.Implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.task.planner.TaskPlanner.DTO.Task;
import edu.task.planner.TaskPlanner.DTO.User;
import edu.task.planner.TaskPlanner.Service.TaskService;

@Service
public class TaskImplement implements TaskService{
	
	public static List<Task> MemoTasks = new ArrayList<Task>();

	@Override
	public List<Task> geTasksList() {
		// TODO Auto-generated method stub
		return MemoTasks;
	}

	@Override
	public Task getTaskById(String id) {
		// TODO Auto-generated method stub
		for(Task t: geTasksList()) {
			if(t.getId().equals(id))return t;
		}
		return null;
	}

	@Override
	public List<Task> getTasksByUserId(String userId) {
		// TODO Auto-generated method stub
		for(User u: UserImplement.MemoUsers) {
			if(u.getId().equals(userId)) {
				return u.getTasks();
			}
		}
		return null;
	}

	@Override
	public Task assignTaskToUser(String taskId, User user) {
		// TODO Auto-generated method stub
		for(User u: UserImplement.MemoUsers) {
			if(u.getId().equals(user.getId())) {
				for(Task t: u.getTasks()) {
					if(t.getId().equals(taskId)) {
						return t;
					}
				}
			}
		}
		return null;
		
	}

	@Override
	public void removeTask(String taskId) {
		// TODO Auto-generated method stub
		for(int i =0;i<MemoTasks.size();i++) {
			if(MemoTasks.get(i).getId().equals(taskId)) {
				MemoTasks.remove(i);
			}
		}
		
	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		for(int i =0;i<MemoTasks.size();i++) {
			if(MemoTasks.get(i).getId().equals(task.getId())) {
				MemoTasks.remove(i);
				MemoTasks.add(task);
				return task;
			}
		}
		return null;
	}

	@Override
	public void createTask(Task task) {
		// TODO Auto-generated method stub
		
	}

}
