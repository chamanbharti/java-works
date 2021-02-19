package java8.consumer;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		
		Consumer<String> consumerStr = s-> {
			System.out.println(s);
		};
		consumerStr.accept("Hello Consumer1");
		consumerStr.accept("How are you?");
		
		Consumer<Integer> consumerInt = i-> {
			System.out.println("Integer value="+i);
		};
		consumerInt.accept(12);
		consumerInt.accept(13);
		
		Consumer<String>consumer1 = s->{
			System.out.println(s+" world.");
		};
		Consumer<String>consumer2 = s->{
			System.out.println(s+" Java.");
		};
		//using andThen method
		consumer1.andThen(consumer2).accept("Hello");
	}
}
