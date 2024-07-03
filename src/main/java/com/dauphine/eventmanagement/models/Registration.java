package com.dauphine.eventmanagement.models;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private Integer eventid;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public void setEventid(Integer eventId) {
        this.eventid = eventId;
    }
}
