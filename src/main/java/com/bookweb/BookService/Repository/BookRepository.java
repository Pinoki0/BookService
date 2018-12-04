package com.bookweb.BookService.Repository;

import com.bookweb.BookService.Model.Book;
import com.bookweb.BookService.Model.BookGenre;
import com.bookweb.BookService.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    Book getBookById(String id);
    List<Book> findBooksByName(String name);
    List<Book> findBooksByPremiereIsBetween(Date dateFrom, Date dateTo);
    List<Book> findBooksByGenre(BookGenre genre);
    List<Book> getBooksById(List<String> likes);
}

