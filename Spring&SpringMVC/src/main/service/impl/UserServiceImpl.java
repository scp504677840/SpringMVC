package main.service.impl;

import main.entities.User;
import main.repository.UserRepository;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserService构造函数");
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listUser() {
        List<User> users = userRepository.listUser();
        System.out.println("call service listUser: " + users.size());
        return users;
    }
}
