package com.abhishek.mtm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abhishek.mtm.dao.BookDAO;
import com.abhishek.mtm.entities.Book;

public class BookDAOImpl implements BookDAO {
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		try {
			em.merge(book);
			t.commit();
			System.out.println("Book is inserted ............");
		}
		catch(Exception ex) {
			t.rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}

	}

	public Book findBook(Integer bookId) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		Book book=em.find(Book.class, bookId);
		em.close();
		return book;
	}

	public void removeBook(Integer bookId) {
		// TODO Auto-generated method stub
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		try {
		Book book=em.find(Book.class, bookId);
		em.remove(book);
		t.commit();
		System.out.println("Book is deleted sucessfully ....");
		}
		catch(Exception ex) {
			t.rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}

	}

}
