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
	public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}

}
