package com.phuc.validate_form_dang_ki.service;


import com.phuc.validate_form_dang_ki.model.User;

import java.util.List;

public interface IUserService {
    void save(User user);

    List<User> findAll();
}
