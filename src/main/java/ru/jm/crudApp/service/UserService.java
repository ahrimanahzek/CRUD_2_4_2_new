package ru.jm.crudApp.service;

import org.springframework.stereotype.Service;
import ru.jm.crudApp.models.User;

import java.util.List;

@Service
public interface UserService {

    public List<User> index();

    public User show(Long id);

    public void save(User user);

    public void update(Long id, User updatedUser);

    public void delete(Long id);
}
