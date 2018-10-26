package com.bookweb.BookService.Model;


import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;

    private String name;
    private String picture;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public User() {}

    public User(String picture, String email, String name) {
        this.name=name;
        this.email=email;
        this.picture=picture;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s,email='%s', name='%s',  picture='%s' ]",
                id, email, name, picture);
    }
}
