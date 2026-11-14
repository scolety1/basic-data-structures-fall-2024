package finalQueue;


public class Date {

	private String name;
	private int age;
	
	public Date(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public int compareTo(Date o) {
		
		if (this.age < o.age) {
			return 1;
		}
		
		else if (this.age > o.age) {
			return -1;
		}
		
		else {
			return 0;
		}
	}
}
