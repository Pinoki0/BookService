package com.bookweb.BookService.Model;
import com.bookweb.BookService.UserLoginType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String picture;
    private String email;
    private UserLoginType loginType;
    private String principalId;
    private List<String> observed;
    private List<String> likes;

    public List<String> getObserved() {
        return observed;
    }

    public void setObserved(List<String> observed) {
        this.observed = observed;
    }

    public List<BookRating> getRatings() {
        return ratings;
    }

    public void setRatings(List<BookRating> ratings) {
        this.ratings = ratings;
    }

    private List<BookRating> ratings;

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


    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }
    public void addLike(String bookId)
    {
        likes.add(bookId);
    }
    public void addObserved(String observed)
    {
        this.observed.add(observed);
    }
}
