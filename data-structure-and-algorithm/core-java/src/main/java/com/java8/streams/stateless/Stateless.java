package com.java8.streams.stateless;

public class Stateless {

	public static void main(String[] args) {
/**
 Stateless operations retain no state from previous elements when processing a new element so each can be processed independently 
of operations on other elements.

Some examples are:

Stream<T> filter(Predicate<? super T> predicate)
Returns a stream of elements that match the given predicate.

<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
Returns a stream with the content produced by applying the provided mapping function to each element. 
There are versions for int, long and double also.

<R> Stream<R> map(Function<? super T,? extends R> mapper)
Returns a stream consisting of the results of applying the given function to the elements of this stream. 
There are versions for int, long and double also.

Stream<T> peek(Consumer<? super T> action)
Returns a stream with the elements of this stream, performing the provided action on each element.
 */
	}
}
