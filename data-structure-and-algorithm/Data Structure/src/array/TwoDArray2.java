package array;

public class TwoDArray2 {

	public static void main(String[] args) {
		
		//jagged array
		//If we are creating odd number of columns in a 2D array, it is known as a jagged array. 
		//In other words, it is an array of arrays with different number of columns.
		int a[][] = new int[3][];
		//declaring 2D array with odd colums
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		
		//initializing a jagged array
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=count++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
