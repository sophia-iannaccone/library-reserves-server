package com.example.libraryreservesserver.controllers;

import com.example.libraryreservesserver.models.Request;
import com.example.libraryreservesserver.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RequestController {
    @Autowired
    RequestService requestService;

    // CREATE operations

    // READ operations
    @GetMapping("/api/requests")
    public List<Request> findAllRequests() {
        return requestService.findAllRequests();
    }

    @GetMapping("/api/requests/{requestId}")
    public List<Request> findRequestById(
            @PathVariable("requestId") Integer requestId) {
        return requestService.findRequestById(requestId);
    }

    @GetMapping("/api/courses/{courseId}/requests")
    public List<Request> findRequestByCourse(
            @PathVariable("courseId") Integer courseId) {
        return requestService.findRequestByCourse(courseId);
    }

    @GetMapping("/api/users/{userId}/requests")
    public List<Request> findRequestByUser(
            @PathVariable("userId") Integer userId) {
        return requestService.findRequestByUser(userId);
    }
}
