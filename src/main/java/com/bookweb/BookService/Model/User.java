package com.bookweb.BookService.Model;
import com.bookweb.BookService.UserLoginType;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class User {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String picture;
    @Column
    private String email;
    @Column
    private UserLoginType loginType;
    @Column
    private String principalId;
    public Enum getLoginType() {
        return loginType;
    }

    public void setLoginType(UserLoginType loginType) {
        this.loginType = loginType;
    }


    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }


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
