package com.bookweb.BookService.Controller;

import com.bookweb.BookService.Model.Book;
import com.bookweb.BookService.Model.BookGenre;
import com.bookweb.BookService.Model.User;
import com.bookweb.BookService.Repository.BookRepository;
import com.bookweb.BookService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.Session;
import java.sql.Date;
import java.util.Properties;

@Controller
public class ServiceController {

    @RequestMapping("/user")
    public String home(@AuthenticationPrincipal User principal)
    {
        return "home";
    }

    @RequestMapping("/search")
    public String search()
    {
        return "search";
    }

    @RequestMapping("/news")
    public String news()
    {
        return "news";
    }


}
