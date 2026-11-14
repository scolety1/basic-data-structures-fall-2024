package stack;

public class Book {

	private String title;
	private String author;
	
	public Book(String t, String a) {
		this.author = a;
		this.title = t;
	}
	
	public String getInfo() {
		return this.title + " by " + this.author;
	}
}
