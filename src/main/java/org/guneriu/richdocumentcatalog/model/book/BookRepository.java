package org.guneriu.richdocumentcatalog.model.book;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.solr.repository.SolrCrudRepository;


@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends SolrCrudRepository<Book, String> {
	
	List<Book> findByName(@Param("name") String name);
	
	List<Book> findByAuthors(@Param("author") String author);
	
	List<Book> findByIsbn(@Param("isbn") String isbn);
	
	List<Book> findByCategory(@Param("category") String category);

}

