package java8.functionalInterface.realWorldEg;

public class BookDTO {

	int id;
	String name;
	String author;

	BookDTO() {
		super();
	}

	public BookDTO(Book book) {
		super();
		this.id = book.id;
		this.name = book.name;
		this.author = book.author;
	}

	public BookDTO(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", name=" + name + ", author=" + author + "]";
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
