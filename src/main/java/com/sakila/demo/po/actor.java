package com.sakila.demo.po;

import java.sql.Timestamp;

public class actor {
    private Integer actorId;
    private String firstName;
    private String LastName;
    private Timestamp LastUpdate;

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        LastUpdate = lastUpdate;
    }
}
