package com.baizhi.controller;

import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("selectAll")
    public String selectAll(Map map) {
        List<Book> books = bookService.selectAll();
        for (Book book : books) {
            Date date = book.getPublishTime();
            long time = date.getTime();
            java.sql.Date sqlDate = new java.sql.Date(time);
            book.setPublishTime(sqlDate);
        }
        map.put("list", books);
        return "forward:/index.jsp";
    }
}
