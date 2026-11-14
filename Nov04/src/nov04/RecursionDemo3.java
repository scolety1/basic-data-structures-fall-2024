package nov04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class RecursionDemo3 {

	private static int size;
	
	public RecursionDemo3() {
		RecursionDemo3.size = 0;
	}
	
	public static void main(String[] args) {
		String[] numbers = {"1", "2"};
		List<String> permutations = new ArrayList<>();
		generatePermutations(numbers, "", permutations);
		System.out.println("Generated Permutations");
		for(String perm: permutations) {
			System.out.println(perm);
		}
		System.out.println(size);
		Random random = new Random();
		String correctAnswer = permutations.get(random.nextInt(permutations.size()));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a guess");
		String userGuess = scanner.nextLine();
		
		System.out.println("My guess:" + userGuess);
		System.out.println("Correct answer:" + correctAnswer);
		
		boolean isCorrect = userGuess.equals(correctAnswer);
		
		//ternary operator
		
		//condition ifTrue : ifFalse
		
		System.out.println("is our guess correct: " + (isCorrect ? "Yes" : "No"));
	}
	
	public static void generatePermutations(String[] numbers, String perm, List<String> list) {
		if (perm.length() == numbers.length) {
			list.add(perm);
			size++;
		}
		else {
			for(int i = 0; i < numbers.length; i++) {
				
				if(perm.contains(numbers[i]) == false){
					generatePermutations(numbers, perm + numbers[i], list);
				}
			}
		}
	}
}
