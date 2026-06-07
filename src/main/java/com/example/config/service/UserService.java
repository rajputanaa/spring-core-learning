package com.example.config.service;

import org.springframework.stereotype.Service;
import com.example.config.repository.UserRepository;
import java.util.List;

@Service                                //Marks class as service/business layer.
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {       //Spring injects repository bean automatically.
        this.userRepository = userRepository;
    }

    public  void addUser(String name){
        userRepository.save(name);          //Business operation.
    }
    public List<String> getAllUsers() {                 //Returns all users.
        return userRepository.findAll();
    }
}
