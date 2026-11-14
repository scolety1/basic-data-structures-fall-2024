package connector;

import java.util.Scanner;

public class ConnectorDemo {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		CircularLinkedList dll = new CircularLinkedList();
		
		System.out.println("Enter you're favorite color:");
		String color = scanner.next();
		System.out.println(color);
		

	}
}
