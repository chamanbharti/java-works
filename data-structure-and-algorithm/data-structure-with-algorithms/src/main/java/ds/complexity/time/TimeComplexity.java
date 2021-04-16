package ds.complexity.time;
/**
 * Big O notation
 * Time Complexity lower to upper
 * constant O(1)
 * logrithmic O(logn)
 * linear	  O(n)
 * quadratic  O(n^2)
 * exponential O(2^n)
 * 
 * @author Chaman.Bharti
 *https://www.youtube.com/watch?v=BBpAmxU_NQo
 */
public class TimeComplexity {

	public static void main(String[] args) {
		//Big O notation
		int arr[] = {10,20,30,40};
		TimeComplexity o = new TimeComplexity();
		o.constant(arr);
	}
	
	public void constant(int[] no) {
		System.out.println("*** O(1) *** ");
		System.out.println(no[0]);
	}
	
	public void constant2(int[] no) {
		System.out.println("*** O(1) or O(2) ***");
		System.out.println(no[0]);
		System.out.println(no[0]);
	}
	
	public void linear(int []no) {
		System.out.println("*** O(1+n+1) = O(2+n) = O(n) ***");//O(1)
		for(int i=0;i<no.length;i++) { //O(n)
			System.out.println(no[i]); 
		}
		System.out.println();//O(1)
	}
	
	public void linear2(int []no) {
		System.out.println("*** O(n+n) = O(2n) = O(n) ***");
		for(int i:no) { //O(n)
			System.out.println(i); 
		}
		for(int i:no) { //O(n)
			System.out.println(i); 
		}
	}
	
	public void linear3(int []no, String[] names) {
		System.out.println("*** O(n + m) = O(n) ***");
		for(int i:no) { //O(n)
			System.out.println(i); 
		}
		for(String name:names) { //O(n) or O(m)
			System.out.println(name); 
		}
	}
	
	public void linear4(int []no) {
		System.out.println("*** O(n * n) = O(n ^ 2) = O(n) ***");
		for(int first:no) { //O(n)
			for(int second:no) { //O(n)
				System.out.println(first+", "+second); 
			}
		}
		
	}
	
	public void quadratic(long []no) {
		System.out.println("*** O(n * n ^ 2) = O(n ^ 2) ***");
		for(long n:no) { //O(n)
			System.out.println(n); 
		}
		for(long first:no) { //O(n)
			for(long second:no) { //O(n)
				System.out.println(first+", "+second); 
			}
		}
		
	}
	
	public void quadratic2(short []no) {
		System.out.println("*** O(n ^ 3) = O(n ^ 2) ***");
		
		for(short first:no) { //O(n)
			for(short second:no) { //O(n)
				for(short third:no) { //O(n)
					System.out.println(first+", "+second+", "+third); 
				}
				
			}
		}
		
	}
}
