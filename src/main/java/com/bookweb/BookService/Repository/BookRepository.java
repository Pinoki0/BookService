package com.bookweb.BookService.Repository;

import com.bookweb.BookService.Model.Book;
import com.bookweb.BookService.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}

