package ieti.api.secure.persistence;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ieti.api.secure.entities.User;

import java.util.List;

@Repository
@Qualifier()
public interface IUserPersistence {
    List<User> getUsersList();

    User getUserById(String userId);

    User createUser(User user);

    User updateUser(User user);

    void removeUser(String userId);
}
