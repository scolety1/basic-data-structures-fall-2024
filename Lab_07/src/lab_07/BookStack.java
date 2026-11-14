package lab_07;

import java.util.Arrays;

public class BookStack implements StackMethods{

	private Book[] data;
	private int top_of_stack;
	private int size;
	
	public BookStack(int capacity) {
		this.data = new Book[capacity];
		this.top_of_stack = -1;
		this.size = 0;
	}
	
	
	@Override
	public void push(Book newBook) {
		if(size == data.length) {
			data = Arrays.copyOf(data, data.length + 1);
		}
		
		top_of_stack ++;
		data[top_of_stack] = newBook;
		size ++;
	}

	@Override
	public Book pop() {
		if(size == 0) {
			System.out.println("Error... stack is empty");
			
		}
		Book removedBook = data[top_of_stack];
		data[top_of_stack] = null;
		top_of_stack --;
		size --;
		return removedBook;
	}

	@Override
	public Book peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
	        return null;
		}
		return data[top_of_stack];
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void printStack() {
		for(int i = top_of_stack; i >= 0; i--) {
			System.out.println("-" + data[i].getInfo());
		}		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
}