package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Color {
	RED, GREEN
}
interface ApplePredicate{
	boolean test (Apple apple);
}

public class ModernJavaBook {

	public static void main(String[] args) {
		List<Apple> inventory  = Arrays.asList(
				 new Apple(80, Color.GREEN),
			     new Apple(155, Color.GREEN),
			     new Apple(120, Color.RED)
				);
//			List<Apple>	greenApples = filterGreenApples(inventory);
//			System.out.println(greenApples);
//			List<Apple>	redApplses = filterApplesByColor(inventory, Color.RED);
//			System.out.println(redApplses);
			
//			List<Apple>appleWeight = filterApplesByWeight(inventory,150);
//			System.out.println(appleWeight);
//			List<Apple> greenApples2 = filterApples(inventory, Color.GREEN, 0, true);
//			System.out.println(greenApples2);
//			List<Apple> heavyApples = filterApples(inventory, null, 150, false);
//			System.out.println(heavyApples);
			
			System.out.println("predicate:");
			List<Apple> greenApples2 = filter(inventory, new AppleColorPredicate());
		    System.out.println(greenApples2);
		    List<Apple> heavyApples = filter(inventory, new AppleWeightPredicate());
		    System.out.println(heavyApples);
	}
	static class AppleColorPredicate implements ApplePredicate{

		@Override
		public boolean test(Apple apple) {
			return Color.GREEN.equals(apple.getColor());
		}
		
	}
	static class AppleWeightPredicate implements ApplePredicate{

		@Override
		public boolean test(Apple apple) {
			return apple.getWeight() > 150;
		}
		
	}
	private static List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple:inventory) {
			if(p.test(apple))
				result.add(apple);
		}
		return result;
	}

	private static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
		List<Apple>result = new ArrayList<>();
		for(Apple apple:inventory) {
			if( (flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
				result.add(apple);
			}
		}
		return result;
	}

	private static List<Apple> filterApplesByWeight(List<Apple> inventory, int i) {
		List<Apple>result = new ArrayList<>();
		for(Apple apple:inventory) {
			if(apple.getWeight() > i) {
				result.add(apple);
			}
		}
		return result;
	}

	private static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		List<Apple>result = new ArrayList<>();
		for(Apple apple:inventory) {
			if(apple.getColor().equals(color)) {
				result.add(apple);
			}
		}
		return result;
	}

	private static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple>result = new ArrayList<>();
		for(Apple apple: inventory) {
			if(Color.GREEN.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
}
