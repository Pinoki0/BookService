package com.bookweb.BookService.Repository;
import com.bookweb.BookService.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByPrincipalId(String principalId);
}
