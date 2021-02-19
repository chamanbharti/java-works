package java8.method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*javarevisited.blogspot.com/2017/03/what-is-method-references-in-java-8-example.html#ixzz6KyWcXz8e
 * https://www.java67.com/2018/06/what-is-double-colon-operator-in-java-8.html
There are four types of method reference in Java 8, 
namely reference to static method, 
reference to an instance method of a particular object, 
reference to a constructor 
and reference to an instance method of an arbitrary object of a particular type. 
In our example, the method reference Order::compareByQuantity is a reference to a static method.

*/
class Order {
	public enum Side{
		BUY,SELL
	}
	private final int quantity; 
	private final String symbol; 
	private final double price; 
	private final Side side; 
	public Order(int quantity, String symbol, double price, Side side) { 
		this.quantity = quantity; 
		this.symbol = symbol; 
		this.side = side; 
		this.price = price; 
		} 
	public int getQuantity() { 
		return quantity; 
		} 
	public String getSymbol() { 
		return symbol; 
		} 
	public double getPrice() { 
		return price; 
		} 
	public Side getSide() { 
		return side; 
		} 
	@Override public String toString() { 
		return String.format("%s %d %s at price %.02f",side, quantity, symbol, price); 
		}
	public static int compareByQuantity(Order a,Order b) {
		return a.quantity - b.quantity;
	}
	public int compareByPrice(Order a,Order b) {
		return Double.valueOf(a.getPrice()).compareTo(Double.valueOf(b.getPrice()));
	}
	public static int compareByValue(Order a,Order b) {
		Double tradeValueOfA = a.getPrice() * a.getQuantity(); 
		Double tradeValueOfB = b.getPrice() * b.getQuantity();

		return tradeValueOfA.compareTo(tradeValueOfB);
	}
}
public class LambaVsMethodReference {
	public static void main(String[] args) {
		// initialize order book with few orders 
		List<Order> orderBook = new ArrayList<>(); 
		orderBook.add(new Order(1000, "GOOG.NS", 1220.17, Order.Side.BUY)); 
		orderBook.add(new Order(4000, "MSFT.NS", 37.47, Order.Side.SELL));
		
		//sort all orders on price using lambda express
		System.out.println("Before sorting:"+orderBook);
		Collections.sort(orderBook, (a,b) -> a.getQuantity() - b.getQuantity());
		System.out.println("After sorting:"+orderBook);
		
		//Collections.sort(orderBook, (a,b) -> Order.compareByQuantity(a, b));
		Collections.sort(orderBook, Order::compareByQuantity);
		System.out.println("After sorting by order quantity:"+orderBook);
		
		Collections.sort(orderBook, Order::compareByValue);
		System.out.println("After sorting by trade value:"+orderBook);
		
		Order order = orderBook.get(0);//you need reference of object
		Collections.sort(orderBook, order::compareByPrice);
		System.out.println("orderBook After sorting by price:"+orderBook);
		// method reference example of an Arbitrary Object of a Particular Type 
		String[] symbols = { "GOOG.NS", "APPL.NS", "MSFT.NS", "AMZN.NS"};
		//Arrays.sort(symbols,(String a,String b)->a.compareToIgnoreCase(b));
		Arrays.sort(symbols,(a,b)->a.compareToIgnoreCase(b));
		// equivalent lambda expression for following would be
		//Arrays.sort(symbols,String::compareToIgnoreCase);
		System.out.println(symbols.toString());
		
	}

}
