package sorting;

public class QuickSort2 {
	public static void main(String[] args) {
	    int[] arrayA = { 23, 47, 81, 95 };
	    int[] arrayB = { 7, 14, 39, 55, 62, 74 };
	    int[] arrayC = new int[10];

	    merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
	    for (int i : arrayC) {
	      System.out.print(i);
	      System.out.print(" ");

	    }
	  }

	  public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
	    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

	    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
	      if (arrayA[arrayAIndex] < arrayB[arrayBIndex])
	        arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
	      else
	        arrayC[arrayCIndex++] = arrayB[arrayBIndex++];

	    while (arrayAIndex < sizeA)
	      arrayC[arrayCIndex++] = arrayA[arrayAIndex++];

	    while (arrayBIndex < sizeB)
	      arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
	  }
}
