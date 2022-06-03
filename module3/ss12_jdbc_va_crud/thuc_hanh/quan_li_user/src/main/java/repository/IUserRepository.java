package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
   List<User> getAll();

   void save(User user);
}
