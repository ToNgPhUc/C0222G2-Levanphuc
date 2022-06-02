package service.iplm;

import model.User;
import repository.IUserRepository;
import repository.iplm.UserRepositoryIplm;
import service.IUserService;

import java.util.List;

public class UserServiceIplm implements IUserService {
    IUserRepository userRepository =new UserRepositoryIplm();

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
//    @Override
//    public List<User> selectAllUsers() {
//        return userRepository.getAll();
//    }
}
