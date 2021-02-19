package sorting;

public class BubbleSort1 {
	//time complexity:O(n square)
	//space complexity:O(1)
	public static void main(String[] args) {
		int [] arr1={10,34,256,7,67,88,42};
		int [] arr2=doBubbleSort(arr1);
		for(int i:arr2){
			System.out.print(i);
			System.out.print(" , ");
		}
		/*for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
			System.out.print(" , ");
		}*/
		/*int i=0;
		while(i!=0){
			System.out.print(arr2[i]);
			System.out.print(" , ");
			i++;
		}*/
		
	}

	
	public static int[] doBubbleSort(int[] a) {
		//step 0
		
		for(int i=0,size=a.length;i<size;i++) {
			for(int j=0;j<=i;j++) {
				if(a[i]<a[j]) { //for ascending order
				//if(a[i]>a[j]) {//for descending order
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
					swap(a,i,j);
				}
			}
		}
		return a;
		//step 01 bubble sort
//		for(int i=1;i<a.length;i++) {
//			for(int j=0;j<a.length-i;j++) {
//				//if(a[j]>a[j+1]) {//for ascending order
//				if(a[j]<a[j+1]) {//for descending order
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		 return a;
		
		//using bubble sort modified technique
//		int i=1;
//		int exchange_flag=1;
//		while( (i<a.length) && (exchange_flag ==1) ) {
//			for(int j=0;j<a.length-i;j++) {
//				exchange_flag=0;
////				if(a[j]>a[j+1]) { //for ascending order
//				if(a[j]<a[j+1]) { //for descending order
//					exchange_flag=1;
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//			i=i+1;
//		}
//		return a;
		//step 1
		//exchange sort
		//10,34,256,7,67,88,42
//		 for(int i=0;i<a.length;i++){
//			 for(int j=i+1;j<a.length;j++){//ascending order
//			 //for(int j=0;j<a.length;j++){//descending order
//				 if(a[i]<a[j]){//> for asc < for desc
//					 int temp=a[i];
//					 a[i]=a[j];
//					 a[j]=temp;
//				 }
//			 }
//		 }
//		 return a;
		
//		 for(int i=0;i<a.length;i++) {
//				for(int j=0;j<=i-1;j++) {
//					if(a[i]<a[j]) { //increasing order
//						//if(a[i]>a[j]) { //decreasing order
//						int temp=a[i];
//						a[i]=a[j];
//						//a[i]=a[i+1];//for decreasing order
//						a[j]=temp;
//					}
//				}
//			}
//			return a;
			//step 2
//			for(int i=0;i<a.length-1;i++){
//			 for(int j=0;j<a.length-i-1;j++){
//				 if(a[j]>a[j+1]){
//					 int temp=a[j];
//					 a[j]=a[j+1];
//					 a[j+1]=temp;
//				 }
//			 }
//		 }
//			return a;
			
			//step 3
			/*   for(int pass=a.length-1;pass>=0;pass--) {
			for(int i=0;i<=pass-1;i++) {
				//if(a[i]>a[i+1]) { increasing order
				if(a[i]<a[i+1]) { //decreasing order
					temp=a[i];
					a[i]=a[i-1];
					//a[i]=a[i+1];//for decreasing order
					a[i+1]=temp;
				}
			}
		}
		return a;*/
			//step 4
			/*for(pass=a.length-1;pass>=0;pass--) {
				swapped=0;
				for(int i=0;i<=pass-1;i++) {
					if(a[i]>a[i+1]) { //increasing order
					//if(a[i]>a[i+1]) { //decreasing order
						temp=a[i];
						a[i]=a[i+1];
						//a[i]=a[i+1];//for decreasing order
						a[i+1]=temp;
						swapped=1;
					}
				}
			}
			return a;*/
	}

	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
}
