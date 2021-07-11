package java8.functionalInterface.realWorldEg;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public static List<Book> getBooks(){
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, " Eng ", "Aman"));
		books.add(new Book(100, " Hindi ", "Birla"));
		books.add(new Book(102, " Math ", "Chankya"));
		return books;
	}

}
