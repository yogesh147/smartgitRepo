package java8.streamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import java8.functionalInterface.realWorldEg.Book;

public class SortMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(111, "F");
		map.put(101, "Z");
		map.put(102, "B");
		map.put(103, "C");

//		map.entrySet().stream().forEach(System.out::println);

//		List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//		Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
//		for (Entry<Integer, String> entry : list) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		Map<Book, Integer> books = new TreeMap<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
		books.put(new Book(1, "A", "A1"), 101);
		books.put(new Book(6, "D", "A4"), 104);
		books.put(new Book(12, "B", "A2"), 102);
		books.put(new Book(3, "C", "A3"), 103);
		
//		books.entrySet().stream().sorted(Map.Entry.comparingByValue());
		books.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book :: getAuthor)));

		System.out.println(books);

	}

}
