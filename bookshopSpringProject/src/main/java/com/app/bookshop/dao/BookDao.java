package com.app.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bookshop.model.Book;

public interface BookDao extends JpaRepository<Book,Long> {

	Book findByName(String bookName);
}
