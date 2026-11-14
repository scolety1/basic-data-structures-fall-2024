package singer;

public class SongDemo {

	public static void main(String[] args) {
		
		Singer charli = new Singer("Charli xcx");
		Singer sabrina = new Singer ("Sabrina Caprpenter");
		
		Song s1 = new Song("Apple", 2024, charli);
		Song s2 = new Song("Feather", 2022, sabrina);
		Song s3 = s2;
		
		s3.setYear(2024);
		s3.setTitle("Espresso");
		
		System.out.println(s2.getTitle());
		
	}
}
