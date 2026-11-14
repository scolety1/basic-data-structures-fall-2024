package program_3;

import java.util.LinkedList;

public class DrawLinkedList {

	private LinkedList<Card> data;
	private Card top_of_stack;
	private int size;
	
	public DrawLinkedList() {
		this.data = new LinkedList<Card>();
		this.top_of_stack = null;
		this.size = 0;
	}
	
	public void pop() {
		if(size == 0) {
			System.out.println("Error... stack is empty");
			return;
		}
		data.remove();
		top_of_stack = data.getFirst();
		size --;
	}
	
	public Card peek() {
		return top_of_stack;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
	}	
}
