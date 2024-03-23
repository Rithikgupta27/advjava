package com.app.bookshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookshop.model.Book;
import com.app.bookshop.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBook() {
		return bookService.getAllBook();
		
	}
	
	@GetMapping("/book/{bookName}")
	public ResponseEntity<Book> getBook(@PathVariable String bookName ){
		
		Book checkBook = bookService.checkBook(bookName); 
		
		if(checkBook == null) {
			ResponseEntity.notFound().build();
		}
		
		return new ResponseEntity<Book>(checkBook,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book newBook){
		if(newBook == null ) {
			return ResponseEntity.notFound().build();		}
		
		return new ResponseEntity<Book>(bookService.addNewBook(newBook),HttpStatus.ACCEPTED );}
		
	
	
	@PutMapping("/book")
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
		if(book == null) {
			return ResponseEntity.notFound().build();
		}
		
		return new ResponseEntity<Book>(bookService.updateBook(book),HttpStatus.ACCEPTED);}
	}
}
