package lab_07;

public class Book {


	private String title;
	private String author;
	
	public Book(String t, String a) {
		this.title = t;
		this.author= a;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return  this.title + " by " + this.author;
	}
	
}
