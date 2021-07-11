package java8.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8.functionalInterface.realWorldEg.Book;
import java8.functionalInterface.realWorldEg.BookDAO;

public class SortingList {

	public static void main(String[] args) {
		// Primitive Type
		// By collections
		List<Integer> nums = Arrays.asList(11, 23, 13, 48, 5, 66);
		Collections.sort(nums);
		Collections.reverse(nums);
		System.out.println(" To Primitve By Collections " + nums);

		// By Stream
		System.out.println(" To Primitve By Stream "
				+ nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

		// Custom Type
		// By collections

		List<Book> books = BookDAO.getBooks();
		System.out.println(books);
		Collections.sort(books, (b1, b2) -> b1.getName().compareTo(b2.getName()));// ASC
		Collections.sort(books, (b1, b2) -> b2.getName().compareTo(b1.getName()));// DES
		System.out.println("To Custom By Collections " + books);

		// By Stream
//	1)	books.stream().sorted((b1, b2) -> b1.getName().compareTo(b2.getName()) ).forEach(System.out :: print);
//	2)	books.stream().sorted(Comparator.comparing(emp -> emp.getId())).forEach(System.out::println);
		books.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);

	}

}
