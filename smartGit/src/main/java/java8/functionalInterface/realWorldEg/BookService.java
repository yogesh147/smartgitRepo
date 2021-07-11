package java8.functionalInterface.realWorldEg;

import java.util.Collections;
import java.util.List;

public class BookService {

	public static List<Book> getSortedBooks() {
		List<Book> books = BookDAO.getBooks();
		Collections.sort(books, (b1, b2)-> b1.getName().compareTo(b2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(BookService.getSortedBooks());
	}

}
