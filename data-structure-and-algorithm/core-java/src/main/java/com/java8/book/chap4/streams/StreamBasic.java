package java8.book.chap4.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
public class StreamBasic {

	public static void main(String[] args) {
		/*
		//Before Java 7
		long startTime = System.currentTimeMillis();
		List<Dish> lowCaloricDishes = new ArrayList<>();
		for(Dish dish:Dish.menu) {
			//Filters the elements using an accumulator
			if(dish.getCalories() < 400) {
				lowCaloricDishes.add(dish);
			}
		}
		
		//sorts the dishes with an anonymous class
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			public int compare(Dish dish1, Dish dish2) {
				return Integer.compare(dish1.getCalories(), dish2.getCalories());
			}
		});
		
		//Processes the sorted list to select the names of dishes
		
		List<String> lowCaloricDishesName = new ArrayList<>();
		for(Dish dish:lowCaloricDishes) {
			lowCaloricDishesName.add(dish.getName());
		}
		System.out.println("Before Java 8");
		System.out.println(lowCaloricDishes);
		System.out.println(lowCaloricDishesName);
		long endTime = System.currentTimeMillis();//1606717699323-1606717657687
		System.out.println("Total time before java 8:"+(endTime - startTime));
		
		//after Java 8
		startTime = System.currentTimeMillis();
		List<String> lowCaloricDishesName2 = 
				Dish.menu
				.stream()
		//To exploit a multicore architecture and execute this code in parallel, 
		//you need only to change stream() to parallelStream():
											    .filter(d->d.getCalories() < 400)
											    .sorted(comparing(Dish::getCalories))
											    .map(Dish::getName)
											    .collect(toList());
		System.out.println("Total time of stream():"+(System.currentTimeMillis() - startTime));
		System.out.println(lowCaloricDishesName2);
		startTime = System.currentTimeMillis();
		List<String> lowCaloricDishesName3 = 
				Dish.menu
				//.stream()
				.parallelStream()
		//To exploit a multicore architecture and execute this code in parallel, 
		//you need only to change stream() to parallelStream():
											    .filter(d->d.getCalories() < 400)
											    .sorted(comparing(Dish::getCalories))
											    .map(Dish::getName)
											    .collect(toList());
		
		System.out.println("After Java 8");
		//System.out.println(lowCaloricDishes);
		System.out.println(lowCaloricDishesName3);
		System.out.println("Total time of parallelStream():"+(System.currentTimeMillis() - startTime));
		
		List<Integer> elements = new ArrayList<>();
		elements.add(10);
		int firstElement1 = elements.listIterator().next();
		System.out.println(firstElement1);
		*/
		
		Map<Dish.Type, List<Dish>> dishesByType = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType));
		System.out.println(dishesByType);
		List<String> threeHighCaloricDishNames = Dish.menu.stream()
				.filter(f->f.getCalories()>300)
				//.filter(Dish::getCalories>300)
				//.map(Dish::getName)
				.map(d->d.getName())
				.limit(3)
				.collect(toList());
		System.out.println(threeHighCaloricDishNames);
		
		List<String> names = Arrays.asList("Java8","Lambdas","In","Action");
		Stream<String> s = names.stream();
		s.forEach(System.out::println);
		
		// uncommenting this line will result in an IllegalStateException:stream has already been operated upon or closed
	    // because streams can be consumed only once
	    //s.forEach(System.out::println);
		
		//External vs. internal iteration
		
		//Collections: external iteration with a for-each loop
		List<String>namesList = new ArrayList<>();
		for(Dish dish:Dish.menu) {
			namesList.add(dish.getName());
		}
		System.out.println(namesList);
		
		//Collections: external iteration using an iterator behind the scenes
		List<String>namesList2 = new ArrayList<>();
		Iterator<Dish>iterator = Dish.menu.iterator();
		while(iterator.hasNext()) {
			Dish dish = iterator.next();
			namesList2.add(dish.getName());
		}
		System.out.println(namesList2);
		
		//Streams: internal iteration
		List<String>namesList3 = Dish.menu.stream().map(Dish::getName).collect(toList());
		//List<String>namesList3 = Dish.menu.stream().map(Dish::getName).collect(Collectors.toList());
		System.out.println(namesList3);
		
		List<String> highCaloricDishes = new ArrayList<>();
		Iterator<Dish> itr = Dish.menu.iterator();
		while(itr.hasNext()) {
			Dish dish = itr.next();
			if(dish.getCalories() > 300) {
			highCaloricDishes.add(dish.getName());
			}
		}
		System.out.println(highCaloricDishes);
		
		List<Dish> highCaloricDishes2 = Dish.menu.stream()
				.filter(d->d.getCalories()>300).collect(toList());
		System.out.println( highCaloricDishes2);
		
		List<String> names2 = Dish.menu.stream()
				.filter(dish-> {
					System.out.println("filtering:"+dish.getName());
					return dish.getCalories()>300;
				})
				.map(dish-> {
					System.out.println("mapping:"+dish.getName());
					return dish.getName();
				})
				.limit(3)
				.collect(toList());
		System.out.println(names2);
		
		long count = Dish.menu.stream().filter(f->f.getCalories()>300).distinct().limit(3).count();
		System.out.println(count);
	}
}
