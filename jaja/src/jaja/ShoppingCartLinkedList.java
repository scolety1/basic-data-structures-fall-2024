package jaja;
import java.util.LinkedList;

public class ShoppingCartLinkedList {

	private LinkedList<Item> cart;
	private int num_of_items;
	
	public ShoppingCartLinkedList() {
		this.cart = new LinkedList<Item>();
		this.num_of_items = 0;
	}
	
	public void addItem(String itemName, double itemPrice, int num) {
		Item newItem = new Item(itemName, itemPrice, num);
		
		cart.add(newItem);
		num_of_items++;
	}
	
	public void printCart() {
		
		for(Item i: cart) {
			System.out.println(i.getQuantity() + " " + i.getName() + " " + i.getPrice());
		}
	}

	public double totalCart() {
		
		Node current = head;
		double answer = 0;
		while(current != null) {
			answer += current.getItem().getPrice() * current.getItem().getQuantity();
			current = current.getNext();
		}
		return answer;
	}
	
	
}
