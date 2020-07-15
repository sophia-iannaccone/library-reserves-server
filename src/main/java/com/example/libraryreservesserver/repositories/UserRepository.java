package com.example.libraryreservesserver.repositories;

import com.example.libraryreservesserver.models.Course;
import com.example.libraryreservesserver.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT user FROM User user")
    public List<User> findAllUsers();

    @Query("SELECT user FROM User user WHERE user.id=:uid")
    public User findUserById(@Param("uid") Integer userId);

    @Query("SELECT user FROM User user WHERE user.username=:username AND user.password=:password")
    User findUserByCredentials(
            @Param("username") String username,
            @Param("password") String password);

    @Query("SELECT user FROM User user WHERE user.username=:u")
    public User findUserByUsername(
            @Param("u") String username);

    @Query("SELECT user.courses FROM User user WHERE user.id=:userId")
    public List<Course> findCoursesForUser(
            @Param("userId") Integer userId);

}
