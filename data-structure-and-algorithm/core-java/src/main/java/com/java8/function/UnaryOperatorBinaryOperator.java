package java8.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorBinaryOperator {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		Function<Integer, Integer>f = i -> i*i;
		System.out.println(f.apply(5));
		System.out.println("Total Time:"+(System.currentTimeMillis() - startTime)+"ms");
		System.out.println("UnaryOperator\nIt is child of Function<T,T>\nIf input and output are same type, then we should go for UnaryOperator");
		//If input and output are same type, then we should go for UnaryOperator
		//It is child of Function<T,T>
		startTime = System.currentTimeMillis();
		UnaryOperator<Integer> ff = i -> i*i;
		System.out.println(ff.apply(6));
		System.out.println("Total Time:"+(System.currentTimeMillis() - startTime)+"ms");
		
		//Primitive version of UnaryOperator
		IntUnaryOperator iuo = i -> i*i;
		System.out.println(iuo.applyAsInt(7));
		LongUnaryOperator luo = i -> i*i;
		System.out.println(luo.applyAsLong(8));
		DoubleUnaryOperator duo = i -> i*i;
		System.out.println(duo.applyAsDouble(9));
		
		System.out.println("connecting with andThen()");
		IntUnaryOperator f1 = i -> i*i;
		IntUnaryOperator f2 = i -> i*i;
		System.out.println(f1.andThen(f2).applyAsInt(5));
		
		System.out.println("Binary Operator\nIt is child of BiFunction<T,T,T>\nIf input and output are same type, then we should go for BinaryOperator");
		BiFunction<String, String, String> concatedString = (s1,s2) -> s1+s2;
		System.out.println(concatedString.apply("Chaman"," Bharti")+" using BiFunction");
		BinaryOperator<String>concatedString2 = (s1,s2) -> s1+s2;
		System.out.println(concatedString2.apply("Chaman"," Bharti")+" using BinaryOperator");
		
		System.out.println("The primitive versions for BinaryOperator");
		System.out.println("BinaryOperator");
		BinaryOperator<Integer>a = (i1,i2) -> i1+i2;
		System.out.println(a.apply(10,20));
		
		System.out.println("IntBinaryOperator");
		IntBinaryOperator b = (a1,b1) -> a1+b1;
		System.out.println(b.applyAsInt(30, 40));
		
		System.out.println("LongBinaryOperator");
		LongBinaryOperator c = (a1,b1) -> a1+b1;
		System.out.println(c.applyAsLong(40, 40));
		
		System.out.println("DoubleBinaryOperator");
		DoubleBinaryOperator d = (a1,b1) -> a1+b1;
		System.out.println(d.applyAsDouble(40, 40));
	}
}
