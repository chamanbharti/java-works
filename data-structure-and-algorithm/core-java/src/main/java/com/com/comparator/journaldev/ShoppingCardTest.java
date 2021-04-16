package com.comparator.journaldev;

public class ShoppingCardTest {
	public static void main(String[] args) {
		ShoppingCard cart = new ShoppingCard();
		
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("chaman.bharti84@gmail.com", "chaman"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Chaman Bharti", "1234567890123456", "786", "12/15"));
	}

}
