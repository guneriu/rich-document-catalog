package org.guneriu.richdocumentcatalog.model.book;

import java.util.List;

public interface BookService {

	List<Book> findByTitle(String title);
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByIsbn(String isbn);
	
	List<Book> findByCategory(String category);

	void save(Book book);

}
