package ieti.api.secure.services;

import org.springframework.stereotype.Service;

import ieti.api.secure.entities.User;

import java.util.*;


@Service
public interface IUserService {
    List<User> getUsersList();

    User getUserById(String userId);

    User createUser(User user);

    User updateUser(User user);

    void removeUser(String userId);
}