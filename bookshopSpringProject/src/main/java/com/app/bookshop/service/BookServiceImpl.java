package com.app.bookshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.bookshop.dao.BookDao;
import com.app.bookshop.model.Book;

public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookDao bookDao; 
	
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public Book checkBook(String bookName) {
	    // TODO Auto-generated method stub
	    Optional<Book> checkBook = Optional.ofNullable(bookDao.findByName(bookName)); 
	    if (checkBook.isPresent()) {
	        return bookDao.findByName(bookName);
	    }
	    return null;
	}

	@Override
	public Book addNewBook(Book newBook) {
		// TODO Auto-generated method stub
		return bookDao.save(newBook);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		
		return bookDao.save(book);
	}

	

}
