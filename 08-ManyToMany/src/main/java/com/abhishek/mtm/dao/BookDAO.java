package com.abhishek.mtm.dao;

import com.abhishek.mtm.entities.Book;

public interface BookDAO {
	
	void saveBook(Book book);
	Book findBook(Integer bookId);
	void removeBook(Integer bookId);
	
}
