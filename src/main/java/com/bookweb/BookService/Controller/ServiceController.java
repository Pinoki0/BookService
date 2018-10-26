package com.bookweb.BookService.Controller;

import com.bookweb.BookService.Model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class ServiceController {
    @RequestMapping("/user")
    @ResponseBody
    public User user(@AuthenticationPrincipal User principal)
    {
        return principal;
    }
}
