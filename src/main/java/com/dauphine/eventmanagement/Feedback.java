package com.dauphine.eventmanagement;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer eventid;
    private String username;
    private String comments;
    private int rating;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public Integer getEventid() {
        return eventid;
    }

    public String getUsername() {
        return username;
    }

    public String getComments() {
        return comments;
    }

    public int getRating() {
        return rating;
    }
}
