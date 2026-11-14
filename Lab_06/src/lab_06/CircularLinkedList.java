package lab_06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CircularLinkedList implements Lab6Methods{
	
	public Node head;
	public Node tail;
	private int size;
	private String fileName;
	
	public CircularLinkedList(String fileName) {
		this.head = null;
		this.tail = null;
		this.size = 0;
		this.fileName = fileName;
		fillLinkedList();
	}
	
    @Override
	public void fillLinkedList() {
		try {
			Scanner input = new Scanner(new FileReader(this.fileName));
			
			while(input.hasNext()) {
				
				String line = input.nextLine();
				String[] value = line.split(",");
				
				String location = value[0];
				String continent = value [1];
				int elevation = Integer.parseInt(value[2]);
				

				Node newNode = new Node(location, continent, elevation);
				append(newNode);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}
	
    @Override
	public void append(Node newNode) {
	
		if(head == null) {
			head = newNode;
			tail = newNode;
			head.setNext(head);
			head.setPrev(tail);
		}
		
		else {
			tail.setNext(newNode);
	        newNode.setPrev(tail);
	        newNode.setNext(head);
	        head.setPrev(newNode);
	        tail = newNode;
		}
		size++;

	}
	
    @Override
	public void printLinkedList() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		Node current = head;
		
		do {
			System.out.println(current.getData());
			current = current.getNext();
		} while(current != head);
    }
    
	
    @Override
	public void search(String searchValue) {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		Node current = head;
		int position = 1;
		
		do {
			if (current.getLocation().equals(searchValue)) {
	            System.out.println(searchValue + " is at position #" + position);
	            return;
			}
			current = current.getNext();
	        position++;
		} while(current != head);
		
	    System.out.println(searchValue + " is not part of the great circle.");
    }
	
    @Override
	public void findGreatestElevationDifference() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}

	    Node current = head;
	    int maxDifference = 0;
	    String location1 = "";
	    String location2 = "";

	    do {
	        int difference = Math.abs(current.getElevation() - current.getNext().getElevation());
	        if (difference > maxDifference) {
	            maxDifference = difference;
	            location1 = current.getLocation();
	            location2 = current.getNext().getLocation();
	        }
	        current = current.getNext();
	    } while (current != head);

	    System.out.println("The greatest elevation difference is between " + location1 + " and " + location2 + " with a difference of " + maxDifference + " ft.");

    }
}    

