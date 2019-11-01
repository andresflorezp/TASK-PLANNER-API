package ieti.api.secure.persistence;

import org.springframework.stereotype.Repository;

import ieti.api.secure.entities.*;

import java.util.*;


@Repository
public interface ITaskPersistence {
 

    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void removeTask(String taskId);

    Task updateTask(Task task);


    void saveTask(Task task);
}