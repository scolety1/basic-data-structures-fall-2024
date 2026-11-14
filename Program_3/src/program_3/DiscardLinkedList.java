package program_3;

import java.util.LinkedList;


public class DiscardLinkedList {
	private LinkedList<Card> data;
	private Card top_of_stack;
	private int size;
	
	public DiscardLinkedList() {
		this.data = new LinkedList<Card>();
		this.top_of_stack = null;
		this.size = 0;
	}
	
	public void push(Card newCard) {
		data.addFirst(newCard);
		size ++;
		top_of_stack = data.getFirst();
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
