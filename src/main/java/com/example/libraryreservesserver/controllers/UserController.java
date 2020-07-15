package com.example.libraryreservesserver.controllers;

import com.example.libraryreservesserver.models.User;
import com.example.libraryreservesserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import java.util.List;

@RestController
@CrossOrigin(
        origins = "*",
        allowCredentials = "true"
)
public class UserController {
    @Autowired
    UserService service;

    @PostMapping("/api/register")
    public User register(
            @RequestBody User user,
            HttpSession session) {
        User existingUser = service.findUserByUsername(user.getUsername());
        if (existingUser == null) {
            User currentUser = service.createUser(user);
            session.setAttribute("currentUser", currentUser);
            return currentUser;
        }
        return null;
    }

    @PostMapping("/api/login")
    public User login(
            @RequestBody User user,
            HttpSession session) {
        User currentUser = service.findUserByCredentials(user.getUsername(), user.getPassword());
        session.setAttribute("currentUser", currentUser);
        return currentUser;
    }

    @PostMapping("/api/profile")
    public User profile(HttpSession session) {
        User currentUser = (User)session.getAttribute("currentUser");
        return currentUser;
    }

    @PostMapping("/api/logout")
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @GetMapping("/api/users/{userId}")
    public User findUserById(
            @PathVariable("userId") Integer userId) {
        return service.findUserById(userId);
    }

    @GetMapping("/api/users")
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }
}
