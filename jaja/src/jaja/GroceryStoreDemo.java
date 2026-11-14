package jaja;

public class GroceryStoreDemo {

	public static void main(String[] args) {
		
		
		ShoppingCartArray cart2 = new ShoppingCartArray();
		ShoppingCartLinkedList cart = new ShoppingCartLinkedList();
		
		
		cart.addItem("Milk", 3.99, 3);
		cart.addItem("Eggs", 2.99, 1);
		cart.addItem("Flour", 6.99, 1);
		
		cart.printCart();
		
		System.out.println(cart.totalCart());
		
		cart2.addItem("Milk", 3.99, 3);
		cart2.addItem("Eggs", 2.99, 1);
		cart2.addItem("Flour", 6.99, 1);
		
		cart2.printCart();
		
		System.out.println(cart2.totalCart());

	}

}
