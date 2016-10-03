package com.fuzzychin.blog.Beans;
//Change Beans to bean
import org.springframework.data.annotation.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Table(name="comments")
@Entity
public class Comment {
    
    @Id
    @GeneratedValue
    long id;

    //There is a @NotNull
    @Column(nullable = false)
    private String body;

    //This needs to be mapped from comment to user
    //@ManyToOne for example.
    @Column(nullable = false)
    private User user;

    //This should be temporal and/or DateTime/Long instead of string.
    @Column(nullable = false)
    private String createdOn;
    
    //This should be temporal and/or DateTime/Long instead of string.
    @Column(nullable = false)
    private  String modifiedOn;
    
    //This should be temporal and/or DateTime/Long instead of string.
    @Column(nullable = false)
    private  String deletedOn;

    //This should be public tbh.
    //protected Comment(){};
    public Comment(){}

    //generally not needed to create the constructor before its needed.
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
