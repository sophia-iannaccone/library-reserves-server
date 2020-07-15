package com.example.libraryreservesserver.repositories;

import com.example.libraryreservesserver.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    @Query("SELECT course FROM Course course")
    public List<Course> findAllCourses();

    @Query("SELECT course FROM Course course WHERE course.id=:courseId")
    public Course findCourseById(
            @Param("courseId") Integer courseId);
}
