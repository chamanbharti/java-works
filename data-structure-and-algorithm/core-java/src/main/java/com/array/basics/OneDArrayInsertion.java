package array.basics;

public class OneDArrayInsertion {
	public static void main(String[] args) {
		
		int array[] = {1,3,5,7,8};
		int item = 10, k = 3, n = 5;
		int i=0,j = n;
		System.out.println("The original array elements are :\n");
		for(i=0;i<n;i++){
			System.out.printf("Array[%d] = %d \n",i,array[i]);
		}
		n = n+1;
		
		while(j>=k){
			array[j+1] = array[j];
			j = j - 1;
		}
		array[k] = item;
		System.out.printf("The array elements after insertion :\n");
		for(i=0;i<n;i++){
			System.out.printf("Array[%d] = %d \n",i,array[i]);
		}
	}

}
