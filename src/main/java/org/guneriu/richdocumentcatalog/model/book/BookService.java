package org.guneriu.richdocumentcatalog.model.book;

import java.util.List;

public interface BookService {

	List<Book> findByName(String name);

	void save(Book book);

}
