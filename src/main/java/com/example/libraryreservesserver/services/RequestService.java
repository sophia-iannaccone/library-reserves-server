package com.example.libraryreservesserver.services;

import com.example.libraryreservesserver.models.Request;
import com.example.libraryreservesserver.repositories.RequestRepository;
import com.example.libraryreservesserver.repositories.CourseRepository;
import com.example.libraryreservesserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RequestService {
    @Autowired
    RequestRepository repository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    UserRepository userRepository;

    // CREATE operations

    // READ operations
    public List<Request> findAllRequests() {
        return repository.findAllRequests();
    }

    public List<Request> findRequestById(Integer requestId) {
        return repository.findRequestById(requestId);
    }

    public List<Request> findRequestByCourse(Integer courseId) {
        return repository.findRequestByCourse(courseId);
    }

    public List<Request> findRequestByUser(Integer userId) {
        return repository.findRequestByUser(userId);
    }

    // UPDATE operations

    // DELETE operations
}

