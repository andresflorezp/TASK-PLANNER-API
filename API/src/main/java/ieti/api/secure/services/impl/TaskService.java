package ieti.api.secure.services.impl;

import ieti.api.secure.entities.Task;
import ieti.api.secure.entities.User;
import ieti.api.secure.persistence.ITaskPersistence;
import ieti.api.secure.services.ITaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("taskService")
public class TaskService implements ITaskService {

    @Autowired
    @Qualifier("taskPersistence")
    ITaskPersistence iTaskPersistence;


    @Override
    public List<Task> geTasksList() {
        return iTaskPersistence.geTasksList();
    }

    @Override
    public Task getTaskById(String id) {
        return iTaskPersistence.getTaskById(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return iTaskPersistence.getTasksByUserId(userId);
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return iTaskPersistence.assignTaskToUser(taskId, user);
    }

    @Override
    public void removeTask(String taskId) {
        iTaskPersistence.removeTask(taskId);
    }

    @Override
    public Task updateTask(Task task) {
        return iTaskPersistence.updateTask(task);
    }

    @Override
    public void saveTasks(Task task) {
        iTaskPersistence.saveTask(task);
    }
}
