package com.bookweb.BookService.Controller;

import com.bookweb.BookService.Model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bookweb.BookService.Repository.NewsRepository;



@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @PostMapping("/addNews")
    public String addNews(@RequestParam String title, @RequestParam String content)
    {
        News news= new News(title,content);
        newsRepository.insert(news);
        return "news";
    }

}
