package org.guneriu.richdocumentcatalog;

import org.guneriu.richdocumentcatalog.config.SearchContext;
import org.guneriu.richdocumentcatalog.model.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Import({RepositoryRestMvcConfiguration.class, SearchContext.class })
//@EnableSolrRepositories(basePackages = { "org.guneriu.richdocumentcatalog.model.book" }, multicoreSupport = true)
public class Application {
	
	@Autowired
	BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("running book service");
//		Book book = new Book(UUID.randomUUID().toString(), "Java Complete Referance", Arrays.asList("Herbert Schildt"), "Java");
//		bookService.save(book);
//		List<Book> findByName = bookService.findByName("Java");
//		for (Book name : findByName) {
//			System.out.println(name);
//		}
//	}
	
	
}
