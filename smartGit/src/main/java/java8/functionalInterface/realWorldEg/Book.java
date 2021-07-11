package java8.functionalInterface.realWorldEg;

public class Book {

	int id;
	String name;
	String author;

	Book() {
		super();
	}

	public Book(BookDTO book) {
		super();
		this.id = book.id;
		this.name = book.name;
		this.author = book.author;

	}

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
