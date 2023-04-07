package com.abhishek.mtm.test;

import java.util.List;

import com.abhishek.mtm.dao.BookDAO;
import com.abhishek.mtm.dao.impl.BookDAOImpl;
import com.abhishek.mtm.entities.Author;
import com.abhishek.mtm.entities.Book;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAOImpl();
		/*
		 * create the book instances
		 */
		/*
		 * Book b1=new Book(); b1.setBookId(101);b1.setBookName("Learn Java"); Book
		 * b2=new Book(); b2.setBookId(102); b2.setBookName("Boot Essentials");
		 * 
		 * 
		 * // create the author instances
		 * 
		 * 
		 * 
		 * Author a1=new Author(); a1.setAuthorId(9001);a1.setAuthorName("abhi"); Author
		 * a2=new Author(); a2.setAuthorId(9002);a2.setAuthorName("spandy"); Author
		 * a3=new Author(); a3.setAuthorId(9003);a3.setAuthorName("pranay");
		 * 
		 * List<Author> list_of_authors_of_book1=Arrays.asList(a1,a3);
		 * b1.setAuthors(list_of_authors_of_book1);
		 * 
		 * List<Author> list_of_authors_of_book2=Arrays.asList(a1,a2,a3);
		 * b2.setAuthors(list_of_authors_of_book2);
		 * 
		 * dao.saveBook(b1); dao.saveBook(b2);
		 */

		Book book_from_db = dao.findBook(102);
		System.out.println("BooK ID :" + book_from_db.getBookId());
		System.out.println("Book Name :" + book_from_db.getBookName());
		List<Author> authors = book_from_db.getAuthors();
		for (Author a : authors) {
			System.out.println(a);
		}
		
		
		
		// System.out.println(book_from_db);
		
		/*
		 * perform remove operation
		 */
		
		//dao.removeBook(101);
	}

}
