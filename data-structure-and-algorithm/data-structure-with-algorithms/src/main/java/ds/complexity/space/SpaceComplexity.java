package ds.complexity.space;
/**
 * Space Complexity lower to upper
 * constant O(1)
 * logrithmic O(logn)
 * linear	  O(n)
 * quadratic  O(n^2)
 * exponential O(2^n)
 * 
 * @author Chaman.Bharti
 *
 */
public class SpaceComplexity {

	public static void main(String[] args) {
	}
	
	public void linear(String [] names) {
//		//O(1) space
//		for(int i=0;i<names.length;i++) { 
//				System.out.println("Hi "+names[i]); 
//		}
		
		//O(n) space
		String[] copy = new String [names.length];
		for(int i=0;i<names.length;i++) { 
				System.out.println("Hi "+names[i]); 
		}

	}
	
}
