package com.example.libraryreservesserver.repositories;

import com.example.libraryreservesserver.models.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RequestRepository extends CrudRepository<Request, Integer> {
    @Query("SELECT request FROM Request request")
    public List<Request> findAllRequests();

    @Query("SELECT request FROM Request request WHERE request.id=:requestId")
    public List<Request> findRequestById(
            @Param("requestId") Integer requestId);

    @Query("SELECT request FROM Request request WHERE request.course.id=:courseId")
    public List<Request> findRequestByCourse(
            @Param("courseId") Integer courseId);

    @Query("SELECT request FROM Request request WHERE request.user.id=:userId")
    public List<Request> findRequestByUser(
            @Param("userId") Integer userId);
}
