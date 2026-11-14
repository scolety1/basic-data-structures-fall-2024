package finalExam;

public class Final {
	public static void main(String[] args) {
		mystery(3);
		}
	private static void mystery(int n) {
		System.out.println(n);
		if(n == 1) {
			return;
			
		}
		else {
			mystery(n-1);
			System.out.println(n);
		}		
	}
}
