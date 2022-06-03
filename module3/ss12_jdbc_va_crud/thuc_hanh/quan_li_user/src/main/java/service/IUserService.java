package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();

    void save(User user);
}
