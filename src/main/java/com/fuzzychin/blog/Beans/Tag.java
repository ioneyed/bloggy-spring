package com.fuzzychin.blog.Beans;


import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Table(name="Tags")
@Entity
public class Tag {

    @Id
    @GeneratedValue
    long id;

    @Column(nullable = false)
    private String descriptor;

    @Column(nullable = false)
    private String content;

    protected Tag(){};

    public Tag(long id, String descriptor, String content) {
        this.id = id;
        this.descriptor = descriptor;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
