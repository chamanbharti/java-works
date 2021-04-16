package interview.surya;

import java.util.*;
public class Program	
{
public static void main(String[] args)
{
	List<Integer> numbers = Arrays.asList(1, 2, 3);
	numbers.stream().map(Program::divideByZero).forEach(System.out::println);
}

public static int divideByZero(int n)
{
	return n / 0;
}
}
