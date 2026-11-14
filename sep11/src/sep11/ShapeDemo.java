package sep11;

import java.util.Scanner;

public class ShapeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a side length");

		while (!scanner.hasNextDouble()) {
			System.out.println("Enter a side length that is a number");
			scanner.next();
		}
		
		double sideLength = scanner.nextDouble();
		
		System.out.println(sideLength);
		
		Square s = new Square(sideLength);
        System.out.println("Square Perimeter: " + s.perimeter() + " Area: " + s.area());
		
		EquequilateralTriangle t = new EquequilateralTriangle(sideLength);
		System.out.println("Triangle Perimeter: " + t.perimeter() + " Area: " + t.area());
		System.out.println("Triangle Perimeter: %.wf Area: %.2f %n" + t.perimeter() + t.area());
		
	
	}	
}