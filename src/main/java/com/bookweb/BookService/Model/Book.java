package com.bookweb.BookService.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String name;
    private BookGenre genre;
    private Date premiere;

    public Book(String name, BookGenre genre, Date premiere, String picture) {
        this.name = name;
        this.genre = genre;
        this.premiere = premiere;
        this.picture = picture;
    }

    private String picture;
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
    public Date getPremiere() {
        return premiere;
    }
    public void setPremiere(Date premiere) {
        this.premiere = premiere;
    }
    public BookGenre getGenre() {
        return genre;
    }
    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }


}
