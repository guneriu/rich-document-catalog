package org.guneriu.richdocumentcatalog.web;

import java.util.List;

import org.guneriu.richdocumentcatalog.model.book.Book;
import org.guneriu.richdocumentcatalog.model.book.BookService;
import org.guneriu.richdocumentcatalog.util.TikaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController()
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Book> getByName(@RequestParam String title) {
		return bookService.findByTitle(title);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String save(@RequestParam MultipartFile file) {
		
		try {
			bookService.save(TikaUtil.exractContent(file.getInputStream()));
		} catch (Exception e) {
			return e.getMessage();
		}
		
		return "success";
	}

}
