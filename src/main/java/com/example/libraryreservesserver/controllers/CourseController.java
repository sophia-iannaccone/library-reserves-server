package com.example.libraryreservesserver.controllers;

import com.example.libraryreservesserver.models.Course;
import com.example.libraryreservesserver.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CourseController {
    @Autowired
    CourseService courseService;

    // CREATE operations

    // READ operations
    @GetMapping("/api/courses")
    public List<Course> findAllCourses() {
        return courseService.findAllCourses();
    }

    @GetMapping("/api/courses/{courseId}")
    public Course findCourseById(
            @PathVariable("courseId") Integer courseId) {
        return courseService.findCourseById(courseId);
    }

    @GetMapping("/api/users/{userId}/courses")
    public List<Course> findCoursesForUser(
            @PathVariable("userId") Integer userId) {
        return courseService.findCoursesForUser(userId);
    }

    // UPDATE operations
    @PutMapping("/api/courses/{courseId}")
    public Course updateCourse(
            @PathVariable("courseId") Integer courseId,
            @RequestBody Course updatedCourse) {
        return courseService.updateCourse(courseId, updatedCourse);
    }

    // DELETE operations
    @DeleteMapping("/api/courses/{courseId}}")
    public List<Course> deleteCourse(
            @PathVariable("courseId") Integer courseId) {
        return courseService.deleteCourse(courseId);
    }
}
