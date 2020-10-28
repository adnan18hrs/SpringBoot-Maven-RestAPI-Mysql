package com.example.mysql;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "mytable")
public class Book {
	
	public void info() {
		System.out.println("Iniside Book");
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookid;
	private String bookName;
	private String bookAuthor;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}
	
	
}
