package com.app.bookshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "book_table")
public class Book {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long bookId;

@Column(name = "bname")
private String bookName;

@Column(name = "author")
private String authorName;

@Column(name  = "descpt")
private String Description;

public Book(String bookName, String authorName, String description) {
	super();
	this.bookName = bookName;
	this.authorName = authorName;
	Description = description;
}

public long getBookId() {
	return bookId;
}

//public void setBookId(long bookId) {
//	this.bookId = bookId;
//}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", Description="
			+ Description + "]";
}


	
	
}
