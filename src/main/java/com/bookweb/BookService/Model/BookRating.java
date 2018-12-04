package com.bookweb.BookService.Model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.IdClass;
import java.sql.Date;

public class BookRating {
    String bookId;

    @Range(min=1,max = 5)
    int bookRating;

    Date ratingDate;
}
