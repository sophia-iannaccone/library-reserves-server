package com.example.libraryreservesserver.services;

import com.example.libraryreservesserver.models.User;
import com.example.libraryreservesserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }

    public User findUserById(Integer id) {
        return repository.findUserById(id);
    }

    public User findUserByCredentials(String username, String password) {
        return repository.findUserByCredentials(username, password);
    }

    public User findUserByUsername(String username) {
        return repository.findUserByUsername(username);
    }
}
