package com.bookweb.BookService.Repository;
import com.bookweb.BookService.Model.Book;
import com.bookweb.BookService.Model.BookRating;
import com.bookweb.BookService.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserByPrincipalId(String principalId);
    User getUserById(String id);
    List<User> findUsersByName(String name);
    List<User> getUsersById(List<String> id);


}
