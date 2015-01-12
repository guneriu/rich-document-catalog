package org.guneriu.richdocumentcatalog.model.book;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "rich-document-catalog")
public class Book {
	private @Id @Indexed String isbn;
	private @Indexed String title;
	private @Indexed String author;
	private @Indexed String category;
	private @Indexed String content;
	private @Indexed("content_type") String contentType;
	
	public Book() {
		this.isbn = UUID.randomUUID().toString();
	}

	public Book(String title, String author, String category) {
		this();
		this.title = title;
		this.author = author;
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	
}
