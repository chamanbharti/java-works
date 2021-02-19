package generic;

public class GenericDemo {

	//generic method printArray
	public static <E> void printArray( E[] inputArray) {
		//display array elements
		for(E element: inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array
	      Long[] longArray = { (long) 1, (long) 2, (long) 3, (long) 4, (long) 53 };
	      System.out.println("Array longArray contains:");
	      printArray(longArray);   // pass an Integer array
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      System.out.println("Array doubleArray contains:");
	      printArray(doubleArray);   // pass an Integer array
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      System.out.println("Array charArray contains:");
	      printArray(charArray);   // pass an Integer array
	      String[] stringArray = { "Hello", "Java", "Python", "JS" };
	      System.out.println("Array stringArray contains:");
	      printArray(stringArray);   // pass an Integer array
	     
	}
}
