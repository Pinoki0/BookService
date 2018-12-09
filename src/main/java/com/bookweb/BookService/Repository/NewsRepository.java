package com.bookweb.BookService.Repository;

import com.bookweb.BookService.Model.News;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NewsRepository extends MongoRepository<News, String> {
    News getBookById(String id);
    List<News> findNewsByTitle(String name);
}
