package com.app.bookshop.service;

import java.util.List;
import java.util.Optional;

import com.app.bookshop.model.Book;

public interface BookService {

	public List<Book> getAllBook();

	public Book checkBook(String bookName);

	public Book addNewBook(Book newBook);

	public Book updateBook(Book book);
}
