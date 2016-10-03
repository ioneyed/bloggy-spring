package com.fuzzychin.blog.Beans;


import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Table(name="Comments")
@Entity
public class Comment {


    @Id
    @GeneratedValue
    long id;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private User user;

    @Column(nullable = false)
    private  String createdOn;

    @Column(nullable = false)
    private  String modifiedOn;

    @Column(nullable = false)
    private  String deletedOn;

    protected Comment(){};

    private Comment(long id, String body, User user, String createdOn, String modifiedOn, String deletedOn) {
        this.id = id;
        this.body = body;
        this.user = user;
        this.createdOn = createdOn;
        this.modifiedOn = modifiedOn;
        this.deletedOn = deletedOn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(String deletedOn) {
        this.deletedOn = deletedOn;
    }
}
