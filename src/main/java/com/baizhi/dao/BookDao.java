package com.baizhi.dao;

import com.baizhi.entity.Book;

import java.util.List;

public interface BookDao {
    public List<Book> selectAll();
}
