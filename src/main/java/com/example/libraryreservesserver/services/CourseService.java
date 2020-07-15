package com.example.libraryreservesserver.services;

import com.example.libraryreservesserver.models.Course;
import com.example.libraryreservesserver.repositories.CourseRepository;
import com.example.libraryreservesserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository repository;

    @Autowired
    UserRepository userRepository;

    // CREATE operations

    // READ operations
    public List<Course> findAllCourses() {
        return repository.findAllCourses();
    }

    public Course findCourseById(Integer courseId) {
        return repository.findCourseById(courseId);
    }

    public List<Course> findCoursesForUser(Integer userId) {
        return userRepository.findCoursesForUser(userId);
    }

    // UPDATE operations
    public Course updateCourse(int courseId, Course updatedCourse) {
        Course course = repository.findCourseById(courseId);
        course.setTitle(updatedCourse.title);
        course.setCode(updatedCourse.code);
        repository.save(course);
        return course;
    }

    // DELETE operations
    public List<Course> deleteCourse(Integer courseId) {
        repository.deleteById(courseId);
        List<Course> result = new ArrayList<Course>();
        return result;
    }
}
