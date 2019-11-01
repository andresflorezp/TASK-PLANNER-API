package ieti.api.secure.services;

import org.springframework.stereotype.Service;

import ieti.api.secure.entities.*;

import java.util.*;

@Service
public interface ITaskService {
    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void removeTask(String taskId);

    Task updateTask(Task task);

    void saveTasks(Task task);
}