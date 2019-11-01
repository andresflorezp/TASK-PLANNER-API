package ieti.api.secure.mocked;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import ieti.api.secure.entities.*;

import java.util.*;


@Service
public interface IDataBase{

    List<Task> geTasksList();
    Task getTaskById(String id);
    List<Task> getTasksByUserId(String userId);
    Task assignTaskToUser(String taskId, User user);
    void removeTask(String taskId);
    Task updateTask(Task task);
    List<User> getUsersList();
    User getUserById(String userId);
    User createUser(User user);
    User updateUser(User user);
    void removeUser(String userId);
    void saveTask(Task task);
}
