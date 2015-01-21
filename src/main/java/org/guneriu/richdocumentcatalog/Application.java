package org.guneriu.richdocumentcatalog;

import org.guneriu.richdocumentcatalog.config.SearchContext;
import org.guneriu.richdocumentcatalog.model.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SearchContext.class })
public class Application {
	
	@Autowired
	BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
