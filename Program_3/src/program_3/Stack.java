package program_3;

import java.util.LinkedList;

public class Stack {

	private LinkedList<Card> data;
	private Card top_of_stack;
	private int size;
	
	public Stack() {
		this.data = new LinkedList<Card>();
		this.top_of_stack = null;
		this.size = 0;
	}
	
	
	public void push(Card newCard) {
		data.addFirst(newCard);
		size ++;
		top_of_stack = data.getFirst();
	}
	
	
	public Card pop() {
		if (size == 0) {
            return null;
        }
		Card popped_card = top_of_stack;
		data.remove();
		if (!data.isEmpty()) {
            top_of_stack = data.getFirst();
        } else {
            top_of_stack = null;
        }
        size--;
        return popped_card;
	}
	
	
	public Card peek() {
		if (size == 0) {
            return null;
        }
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
	
	
	public int getSize() {
		return size;
	}
}
