package org.guneriu.richdocumentcatalog.model.book;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "rich-document-catalog")
public class Book {
	private @Id @Indexed String isbn;
	private @Indexed String name;
	private @Indexed("author") List<String> authors;
	private @Indexed String category;

	public Book(String isbn, String name, List<String> authors, String category) {
		this.isbn = isbn;
		this.name = name;
		this.authors = authors;
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", authors=" + authors
				+ ", category=" + category + "]";
	}

}
