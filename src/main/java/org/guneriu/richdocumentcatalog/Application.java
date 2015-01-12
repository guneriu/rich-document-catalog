package org.guneriu.richdocumentcatalog;

import org.guneriu.richdocumentcatalog.config.SearchContext;
import org.guneriu.richdocumentcatalog.model.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Import({SearchContext.class })
public class Application {
	
	@Autowired
	BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
