package org.guneriu.richdocumentcatalog.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.DublinCore;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.guneriu.richdocumentcatalog.model.book.Book;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public final class TikaUtil {

	private static Parser parser = new AutoDetectParser();
	private static ParseContext parseContext = new ParseContext();

	private TikaUtil() {
	}

	public static Book exractContent(InputStream inputStream) {
		Book book = new Book();

		try {
			Metadata metadata = new Metadata();
			ContentHandler contentHandler = new BodyContentHandler(
					10 * 1024 * 1024);
			parser.parse(inputStream, contentHandler, metadata, parseContext);
			extractMetadatas(book, metadata, contentHandler);
		} catch (IOException | SAXException | TikaException e) {
			e.printStackTrace();
		}

		return book;
	}

	private static void extractMetadatas(Book book, Metadata metadata, ContentHandler contentHandler) {
		book.setAuthor(metadata.get(DublinCore.CREATOR));
		book.setTitle(metadata.get(DublinCore.TITLE));
		book.setContentType(metadata.get(DublinCore.FORMAT));
		book.setContent(contentHandler.toString());
	}

}
