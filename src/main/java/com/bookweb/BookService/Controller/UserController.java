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
import java.sql.Date;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Model getUserById(@PathVariable String id, Model model)
    {
        model.addAttribute("user",userRepository.getUserById(id));
        return model;
    }
    @GetMapping("/user/observed")
    public Model getUsersFromObservedList(@AuthenticationPrincipal User principal, Model model)
    {
        model.addAttribute("users", userRepository.getUsersById(principal.getObserved()));
        return model;
    }

    @GetMapping("/user/ratings")
    public Model getBooksRatings(@AuthenticationPrincipal User principal, Model model)
    {
        model.addAttribute("ratings", principal.getRatings());
        return model;
    }
}