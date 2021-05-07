package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class CollectorsAndDownStream {

	public static void main(String[] args) {
		
/**
 Collectors (note:first of all, read Reduction0 from com.java8.streams.reduction package)
 
The previous version of collect() is useful to learn how collectors work, but in practice, 
it's better to use the other version.

Some common collectors of the Collectors class are:

toList Accumulates elements into a List.
toSet Accumulates elements into a Set.
toCollection Accumulates elements into a Collection implementation.
toMap Accumulates elements into a Map.
joining Concatenates elements into a String.
groupingBy Groups elements of type T in lists according to a classification function, into a map with keys of type K.
partitioningBy Partitions elements of type T in lists according to a predicate, into a map.
Since calculation methods can be implemented as reductions, the Collectors class also provides them as collectors:

averagingInt/averagingLong/averagingDouble Methods return the average of the input elements.
counting Counts the elements of input elements.
maxBy Returns the maximum element according to a given Comparator.
minBy Returns the minimum element according to a given Comparator.
summingInt/summingLong/summingDouble Returns the sum of the input elements.
This way, we can rewrite our previous example:
		
It's recommended to use the three version reduce() method when:

Working with parallel streams
Having one function as a mapper and accumulator is more efficient than having separate mapping and reduction functions.
On the other hand, collect() has two versions:

<R,A> R collect(Collector<? super T,A,R> collector)

<R> R collect(Supplier<R> supplier,
              BiConsumer<R,? super T> accumulator,
              BiConsumer<R,R> combiner)
              
The first version uses predefined collectors from the Collectors class while the second one allows you to create your own collectors. 
Primitive streams (like IntStream) only have this last version of collect().

Remember that collect() performs a mutable reduction on the elements of a stream, 
which means that it uses a mutable object for accumulating, like a Collection or a StringBuilder. 
In contrast, reduce() combines two elements to produce a new one and represents an immutable reduction.

However, let's start with the version that takes three arguments, 
as it's similar to the reduce() version that also takes three arguments.

As you can see from its signature, first, 
it takes a Supplier that returns the object that will be used and returned as a container (accumulator).

The second parameter is an accumulator function, which takes the container and the element to be added to it.

The third parameter is the combiner function, 
which merges the intermediate results into the final one (useful when working with parallel streams).

This version of collect() is equivalent to:

R result = supplier.get();
for (T element : stream) {
    accumulator.accept(result, element);
}
return result;

For example, if we want to "reduce" or "collect" all the elements of a stream into a List, use the following algorithm:
		 */
				List<Integer>list = Stream.of(1,2,3,4,5)
						.collect(
								 () -> new ArrayList<>(),//creating the container
								 (l,i) -> l.add(i),//adding an element
								 (l1,l2) -> l1.addAll(l2)//combining elements
								);
				System.out.println(list);
				
				// We can make it clearer by adding the argument types:
				List<Integer> list2 = Stream.of(1, 2, 3, 4, 5)
					        .collect(
					           () -> new ArrayList<>(),
					           (l, i) -> l.add(i),
					           (l1, l2) -> l1.addAll(l2)
					        );
				System.out.println(list2);
				
				// We can also use method references:
				List<Integer> list3 = Stream.of(1, 2, 3, 4, 5)
						.collect(
								ArrayList::new,
								ArrayList::add,
								ArrayList::addAll
								);
		System.out.println(list3);//[1, 2, 3, 4, 5]
		
		// As:
		List<Integer>list4 = Stream.of(1,2,3,4,5).collect(Collectors.toList());
		System.out.println(list4);//[1, 2, 3, 4, 5]
		
		// Since all these methods are static, we can use static imports.
		List<Integer>list5 = Stream.of(1,2,3,4,5).collect(toList());
		System.out.println(list5);//[1, 2, 3, 4, 5]
		
		/**
		 If we are working with streams of strings, we can join all the elements into one String with:
		 */
		String s = Stream.of("a","simple","string").collect(joining());//asimplestring
		System.out.println(s);
		
		/**
		 We can also pass a separator:
		 */
		String s2 = Stream.of("a","simple","string").collect(joining(" "));//a simple string
		System.out.println(s2);
		
		/**
		 And a prefix and a suffix:
		 */
		String s3 = Stream.of("a","simple","string").collect(joining(" ","This is ","."));//This is a simple string.
		System.out.println(s3);
		
		/**
		 The calculation methods are easy to use. Except for counting(), 
		 they either take a Function to produce a value to apply the operation or (in the case of maxBy and minBy) 
		 they take a Comparator to produce the result:
		 */
		
		double avg = Stream.of(1,2,3)
				.collect(averagingInt(i -> i * 2));// 4.0
		System.out.println("average:"+avg);
		
		long count = Stream.of(1,2,3).collect(counting());//3
		System.out.println("count:"+count);
		
		//Stream.of(1,2,3).collect(maxBy(Comparator.naturalOrder())).ifPresent(System.out::println);
		Optional<Integer> optionalMax = Stream.of(1,2,3).collect(maxBy(Comparator.naturalOrder()));
		System.out.println("Max number:"+optionalMax.get());
		
		Integer sum = Stream.of(1,2,3).collect(summingInt(i -> i));//6
		System.out.println("Sum:"+sum);
		
/*
The Collectors class also provides two functions to group the elements of a stream into a list, 
in a kind of an SQL GROUP BY style.

The first method is groupingBy() and it has three versions. 
This is the first one:

groupingBy(Function<? super T,? extends K> classifier)

It takes a Function that classifies elements of type T, 
groups them into a list and returns the result in a Map where the keys (of type K) are the Function returned values.

For example, if we want to group a stream of numbers by the range they belong (tens, twenties, etc.), 
we can do it with something like this:
*/
		Map<Integer, List<Integer>> map = Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
				.collect(groupingBy(i -> i/10 * 10));
		System.out.println(map);
/**
 The moment you compare this code with the iterative method (with a for loop), 
 you realize the power of streams and collect(). 
 Just look at how many lines of code are used in the traditional implementation.
 */
		List<Integer> stream =
			    Arrays.asList(2,34,54,23,33,20,59,11,19,37);
			Map<Integer, List<Integer>> map2 = new HashMap<>();

			for(Integer i : stream) {
			    int key = i/10 * 10;
			    List<Integer> list_ = map2.get(key);

			    if(list_ == null) {
			        list_ = new ArrayList<>();
			        map2.put(key, list_);
			    }
			    list_.add(i);
			}
			System.out.println(map2);
		/*
		 In the end, both strategies return the same map.

		{0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}
		 */
/**
 Downstream Collectors
As you may have noticed, the second version takes a downstream collector as an additional argument:

groupingBy(Function<? super T,? extends K> classifier,Collector<? super T,A,D> downstream)
A downstream collector is a collector that is applied to the results of another collector.

We can use any collector here, for instance, to count the elements in each group of the previous example		
 */
			Map<Integer, Long> map3 =
				    Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
				        .collect(
				             groupingBy(i -> i/10 * 10, counting()
				            )
				        );
			System.out.println(map3);
/**
 Notice how the type of the values of the Map change to reflect the type returned by the downstream collector, counting().

This will return the following map:

{0=1, 50=2, 20=2, 10=2, 30=3}

We can even use another groupingBy() to classify the elements in a second level. 
For instance, instead of counting, we can further classify the elements as even or odd:
 */
			Map<Integer, Map<String, List<Integer>>> map4 =
					   Stream.of(2,34,54,23,33,20,59,11,19,37)
					       .collect(groupingBy(
					    		   i -> i/10 * 10, groupingBy(i -> i%2 == 0 ? "EVEN" : "ODD")
					                )
					       );
			System.out.println(map4);
			
/**
 This will return the following map (with a little formatting):

{
    0 = {EVEN=[2]},
   50 = {EVEN=[54], ODD=[59]},
   20 = {EVEN=[20], ODD=[23]},
   10 = {ODD=[11, 19]},
   30 = {EVEN=[34], ODD=[33, 37]}
}
The key to the high-level map is an Integer because the first groupingBy() returns a one.

The type of the values of the high-level map changed (again) to reflect the type returned by the downstream collector, groupingBy().

In this case, a String is returned; this will be the type of the keys of the second-level map, 
and since we are working with an Integer Stream, the values have a type of List<Integer>.

Seeing the output of these examples, you may be wondering, is there a way to order the results?

Well, TreeMap is the only implementation of Map that is ordered. Fortunately, 
the third version of groupingBy() has a Supplier argument that lets us choose the type of the resulting Map:

groupingBy(Function<? super T,? extends K> classifier,
           Supplier<M> mapFactory,
           Collector<? super T,A,D> downstream)

This way, if we pass an instance of TreeMap:
 */
			Map<Integer, Map<String, List<Integer>>> map5 =
				    Stream.of(2,34,54,23,33,20,59,11,19,37)
				       .collect( groupingBy(i -> i/10 * 10,
				                 TreeMap::new,
				                 groupingBy(i -> i%2 == 0 ? "EVEN" : "ODD")
				               )
				       );
			System.out.println(map5);

				/*
				 This will return the following map:
				{
				    0 = {EVEN=[2]},
				   10 = {ODD=[11, 19]},
				   20 = {EVEN=[20], ODD=[23]},
				   30 = {EVEN=[34], ODD=[33, 37]},
				   50 = {EVEN=[54], ODD=[59]}
				}
				*/

/**
 partitioningBy()
The second method for grouping is partitioningBy().

The difference with groupingBy() is that partitioningBy() will return a Map with a Boolean as the key type, 
which means there are only two groups, one for true and one for false.

There are two versions of this method. The first one is:

partitioningBy(Predicate<? super T> predicate)
java
It partitions the elements according to a Predicate and organizes them into a Map<Boolean, List<T>>.

For example, if we want to partition a stream of numbers by the ones that are less than 50 and the ones that don't, 
we can do it this way:
 */
			Map<Boolean, List<Integer>> map6 =
				    Stream.of(45, 9, 65, 77, 12, 89, 31)
				        .collect(
				        		partitioningBy(i -> i < 50)
				        		);
			System.out.println(map6);
/**
 This will return the following map:

{false=[65, 77, 89], true=[45, 9, 12, 31, 12]}

As you can see, because of the Predicate, the map will always have two elements.

And like groupingBy(), this method has a second version that takes a downstream collector.

For example, if we want to remove duplicates, we just have to collect the elements into a Set like this:
 */
			Map<Boolean, Set<Integer>> map7 =
				    Stream.of(45, 9, 65, 77, 12, 89, 31, 12)
				        .collect(
				            partitioningBy(i -> i < 50, toSet()
				            )
				        );
			System.out.println(map7);
/**
 This will produce the following Map:

{false=[65, 89, 77], true=[9, 12, 45, 31]}

However, unlike groupingBy(), there's no version that allows us to change the type of the Map returned. 
However, we only need two keys for our groups.

Set<Integer> lessThan50 = map7.get(true);
Set<Integer> moreThan50 = map7.get(false);
 */
	}
}
