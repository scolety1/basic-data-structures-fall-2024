import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int random_number = rand.nextInt(1, 100);
		//System.out.println(random_number);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Your guess?");
		int user_guess = scan.nextInt();
		
		int counter = 1;
		while(user_guess != random_number) {
			
			if(user_guess > random_number) {
				System.out.println("Lower!");
			}
			if(user_guess < random_number) {
				System.out.println("Higher!");
			}
			user_guess = scan.nextInt();
			counter += 1;
		}
		System.out.println("You got it!");
		System.out.println("That took " + counter + " Guesses!");
		}
}
