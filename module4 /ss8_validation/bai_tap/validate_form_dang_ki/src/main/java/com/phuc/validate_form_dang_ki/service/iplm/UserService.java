package com.phuc.validate_form_dang_ki.service.iplm;

import com.phuc.validate_form_dang_ki.model.User;
import com.phuc.validate_form_dang_ki.repository.IUserRepository;
import com.phuc.validate_form_dang_ki.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public void save(User user) {
        this.iUserRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }
}