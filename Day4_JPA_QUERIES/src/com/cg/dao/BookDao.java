package com.cg.dao;

import java.util.List;

import com.cg.entities.Book;

public interface BookDao
{
	public abstract Book getBookbyId(int id);
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookCount();
	public abstract List<Book> getAuthorBooks(String author);
	public abstract List<Book> getAllBook();
	public abstract List<Book>getBookInPriceRange(double low, double high);
}