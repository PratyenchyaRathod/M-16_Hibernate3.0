package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entities.Book;

public class BookDaoImpl implements BookDao
{
	private EntityManager entityManager;
	
	public BookDaoImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Book getBookbyId(int id) {
		Book book=entityManager.find(Book.class,id);
		return null;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr = "SELECT book FROM book WHERE book.title LIKE : ptitle";
		TypedQuery<Book> query = entityManager.createQuery(qStr,Book.class);
		query.setParameter("ptitle", "%"+title+"%");
		return query.getResultList();
		
	}

	@Override
	public Long getBookCount() {
		String qStr = "SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long> query = entityManager.createQuery(qStr,Long.class);
		Long count=query.getSingleResult();
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		String qStr = "SELECT book FROM book WHERE book.author LIKE : pauthor";
		TypedQuery<Book> query = entityManager.createQuery(qStr,Book.class);
		query.setParameter("pauthor", author);
		return query.getResultList();
	}

	@Override
	public List<Book> getAllBook() {
		Query query =entityManager.createQuery("getAllBook");
		return query.getResultList();
	}
	

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		String qStr = "SELECT book FROM book WHERE book.price BETWEEN : low and high";
		TypedQuery<Book> query = entityManager.createQuery(qStr,Book.class);
		query.setParameter("low",low);
		query.setParameter("high",high);
		return query.getResultList();
	}

}
