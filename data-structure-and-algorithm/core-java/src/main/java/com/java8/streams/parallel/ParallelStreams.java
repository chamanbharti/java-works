package com.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreams {

	public static void main(String[] args) {
		
/**
Parallel Streams
Until now, all the examples have used sequential streams, where each element are processed one by one.

Parallel streams split the stream into multiple parts. Each part is processed by a different thread at the same time (in parallel).

Under the hood, parallel streams use the Fork/Join Framework.

This means that, by default, 
the number of threads available to process parallel streams equals the number of available cores in your machine's processor (CPU).

Parallel stream operations
To create a parallel stream just use the parallel() method:
 */
		Stream<String> parallelStream = Stream.of("a","b","c").parallel();

// To create a parallel stream from a Collection use the parallelStream() method:

		List<String> list = Arrays.asList("a","b","c");
		Stream<String> parStream = list.parallelStream();

/**
 You can turn a parallel stream into a sequential one with the sequential() method:
 
 stream
   .parallel()
      .filter(..)
         .sequential()
            .forEach(...);
Check if a stream is parallel with isParallel():


stream.parallel().isParallel(); // true

And turn an ordered stream into an unordered one (or ensure that the stream is unordered) with unordered();

stream
   .parallel()
      .unordered()
         .collect(...);

Under the hood
But how do parallel streams work? Let's start with the simplest example:

Stream.of("a","b","c","d","e")
    .forEach(System.out::print);

Printing a list of elements with a sequential stream will output the expected result:

abcde
However, when using a parallel stream:

Stream.of("a","b","c","d","e")
    .parallel()
    .forEach(System.out::print);

The output can be different for each execution:

cbade // One execution
cebad // Another execution
cbdea // Yet another execution
Going back to the definition of parallel streams, 
this output starts making sense. The differences in output can be attributed to thread processing; 
it is possible that a different core is involved with a particular command each time the code is executed.

Thus parallel streams are more appropriate for operations where the order of processing doesn't matter 
and the operations don't need to keep a state (stateless and independent operations).

An example to see this difference is the use of findFirst() versus findAny().

In the first part, we mentioned that findFirst() method returns the first element of a stream. 
But since we're using parallel streams, this method has to "know" which element is the first one:
 */
		
		long start = System.nanoTime();
		String first = Stream.of("a","b","c","d","e")
		    .parallel().findFirst().get();
		long duration = (System.nanoTime() - start) / 1000000;
		System.out.println(
		    first + " found in " + duration + " milliseconds");
/**
 The output:

a found in 2.436155 milliseconds

Because of that, if the order doesn't matter, it's better to use findAny() with parallel streams:
 */
		long start2 = System.nanoTime();
		String any = Stream.of("a","b","c","d","e")
		    .parallel().findAny().get();
		long duration2 = (System.nanoTime() - start2) / 1000000;
		System.out.println(
		    any + " found in " + duration2 + " milliseconds");
		
/**
 c found in 0.063169 milliseconds

Since a parallel stream is processed by multiple cores, it's reasonable to believe that it will be processed faster than a sequential stream. But as you can see with findFirst(), this is not always the case.

For example:
Stream<T> distinct()
Stream<T> sorted()
Stream<T> sorted(Comparator<? super T> comparator)
Stream<T> limit(long maxSize)
Stream<T> skip(long n)

The stateful operations above incorporate state from previously processed elements 
and usually need to go through the entire stream to produce a result. 
Thus they work better with sequential streams since they end up looking through the stream anyway.

But don't believe that by first executing the stateful operations in a sequential format 
and then turning the stream into a parallel one, the performance will be better in all cases. 
It would be worse to assume that the entire operation may run in parallel, like the following example:
 */
		
		double start3 = System.nanoTime();
		Stream.of("b","d","a","c","e")
		    .sorted()
		    .filter(s -> {
		        System.out.println("Filter:" + s);
		        return !"d".equals(s);
		    })
		    .parallel()
		    .map(s -> {
		        System.out.println("Map:" + s);
		        return s += s;
		    })
		    .forEach(System.out::println);
		double duration3 = (System.nanoTime() - start3) / 1_000_000;
		System.out.println(duration3 + " milliseconds");
		
/**
 One might think that the stream is sorted and filtered sequentially, but the output shows something else:

Filter:c
Map:c
cc
Filter:a
Map:a
aa
Filter:b
Map:b
bb
Filter:d
Filter:e
Map:e
ee
79.470779 milliseconds

Compare this with the output of the sequential version (just comment out .parallel()):

Filter:a
Map:a
aa
Filter:b
Map:b
bb
Filter:c
Map:c
cc
Filter:d
Filter:e
Map:e
ee
1.554562 milliseconds

Clearly, the sequential version performed better; it took 78 milliseconds less.

But if we have an independent or stateless operation, and order doesn't matter, 
such as with counting the number of odd numbers in a large range, the parallel version will perform better:
 */
		
		double start4 = System.nanoTime();
		long c = IntStream.rangeClosed(0, 1_000_000_000)
		            .parallel()
		            .filter(i -> i % 2 == 0)
		            .count();
		double duration4 = (System.nanoTime() - start4) / 1_000_000;
		System.out.println("Got " + c + " in " + duration4 + " milliseconds");
		
/**
 The parallel version output:

Got 500000001 in 738.678448 milliseconds

The sequential version output:

Got 500000001 in 1275.271882 milliseconds

In summary, parallel streams don't always perform better than sequential streams when it comes to stateful operations, 
but they usually perform better when ordering is not an issue and operations are independent and stateless.

This, the fact that parallel streams process results independently, 
and the idea that the order cannot be guaranteed are the most important things you need to know.

Tips for deciding between sequential and parallel streams
In practice, how do you know when to use sequential or parallel streams for better performance?

Here are some rules:

For a small set of data, sequential streams are almost always the best choice due to the overhead of the parallelism. 
Using parallel streams is simply unnecessary.
Typically avoid using parallel streams with stateful (like sorted()) and order-based (like findFirst()) operations. 
Sequential streams do just fine (if not better) in these cases.
Use parallel streams with operations that are computationally expensive (considering all the operation in the pipeline).
When in doubt, check the performance with an appropriate benchmark. To demonstrate, I used an execution time comparison, 
but this is just one benchmark. You may need your program to compile faster or use less memory.
Reducing Parallel Streams
In concurrent environments, assignments are bad.

This is because if you mutate the state of variables (especially if they are shared by more than one thread), 
you may run into invalid states.

Consider this example, which implements the factorial of 10 in a very particular way:
 */
		
		class Total {
		    public long total = 1;
		    public void multiply(long n) { total *= n; }
		}
		
		Total t = new Total();
		LongStream.rangeClosed(1, 10)
		    .forEach(t::multiply);
		System.out.println(t.total);
		
/**
 Here, we are using a variable to gather the result of the factorial. The output of executing this snippet of code is:

3628800

However, when we turn the stream into a parallel one:
 */
		LongStream.rangeClosed(1, 10)
	    .parallel()
	    .forEach(t::multiply);
		
/**
 Sometimes we get the correct result and other times we don't.

The problem is caused by the multiple threads accessing the variable total concurrently. 
Yes, we can synchronize the access to this variable, but that defeats the purpose of parallelism.

Here's where reduce() comes in handy.

Remember that reduce() combines the elements of a stream into a single one.

With parallel streams, this method creates intermediate values and then combines them, 
avoiding the ordering problem while still allowing streams to be processed 
in parallel by eliminating the shared state and keeping it inside the reduction process.

The only requirement is that the applied reducing operation must be associative.

This means that the operation op must follow this equality:

(a op b) op c == a op (b op c)
Or:

a op b op c op d == (a op b) op (c op d)
So we can evaluate (a op b) and (c op d) in parallel.

We can implement our example using parallel() and reduce() in this way:
 */
		
		long tot = LongStream.rangeClosed(1, 10)
                .parallel()
                .reduce(1, (a,b) -> a*b);
		System.out.println(tot);
/**
 When we execute this snippet of code, it produces the correct result every time (3628800). 
 Reduce guaranteed that the threads would not access the same stream entries simultaneously and throw off the results.

Plus, if we time the execution of the first snippet and this last one, we can see a drastic improvement in performance.

We can safely use collect() with parallel streams if we follow the same requirements of associativity and identity. 
(For example, combining any partially accumulated result with an empty result container must produce an equivalent result.)

Or, if we are grouping with the Collectors class and ordering is not important, we can use the method groupingByConcurrent(), 
the concurrent version of groupingBy().

If you understand when to use parallel streams and the issues associated with concurrent execution, 
you should be ready to use parallel streams in practice!

Conclusion
We touched the most important parts of the Stream interface. I hope you find streams useful. 
 */
 }
}
