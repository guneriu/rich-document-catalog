package org.guneriu.richdocumentcatalog.model.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	SolrOperations solrTemplate;
	
	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}
	
	@Override
	public List<Book> findByTitle(String title) {
		return bookRepository.findByTitle(title);
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> findByIsbn(String isbn) {
		return bookRepository.findByIsbn(isbn);
	}

	@Override
	public List<Book> findByCategory(String category) {
		return bookRepository.findByCategory(category);
	}

}
