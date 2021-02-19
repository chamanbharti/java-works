package interview.surya;

import java.util.*;
import java.util.stream.*;

public class Celebratix {
  public static void main(String[] args)
  {
   ArrayList<Integer> myList = new ArrayList<>( );
   myList.add(7);
   myList.add(4);
   myList.add(10);
   myList.add(3);
   myList.add(17);
   Stream<Integer> myStream = myList.stream();

   Stream<Integer> myVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
   myVals = myList.stream().filter( (n) -> (n % 2) == 1)
   .filter((n) -> n > 5);
   myVals.forEach((n) -> System.out.print(n + " ") );
   }
}

