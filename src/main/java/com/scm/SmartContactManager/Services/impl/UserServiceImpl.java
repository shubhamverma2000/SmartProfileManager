package com.scm.SmartContactManager.Services.impl;


import com.scm.SmartContactManager.Repositories.UserRepository;
import com.scm.SmartContactManager.Services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }
}
