package com.example.libraryreservesserver.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @OneToOne
    public User user;

    @OneToOne
    public Course course;

    public Date subSent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getSubSent() {
        return subSent;
    }

    public void setSubSent(Date subSent) {
        this.subSent = subSent;
    }
}
