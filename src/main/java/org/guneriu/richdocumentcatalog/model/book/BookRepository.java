package org.guneriu.richdocumentcatalog.model.book;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;


public interface BookRepository extends SolrCrudRepository<Book, String> {
	
	List<Book> findByTitle(String title);
	
	List<Book> findByAuthor(String author);
	
	List<Book> findByIsbn(String isbn);
	
	List<Book> findByCategory(String category);

}

