package mathematics;
//Java program to find maximum number of 
//handshakes. 
public class HandShake1 {

	// Calculating the maximum number of  
    // handshake using derived formula. 
	static int maxHandShake(int n) {
		return (n*(n-1))/2;
	}
	
	// function to find all 
	// possible handshakes 
	static int recursiveHandshake(int n)  
	{ 
	    // when n becomes 0 that  
	    // means all the persons  
	    // have done handshake 
	    // with other 
	    if (n == 0)  
	        return 0; 
	    else
	        return (n - 1) + recursiveHandshake(n - 1);  
	} 
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println("total handshake is:"+maxHandShake(n));
		System.out.println("total handshake is:"+recursiveHandshake(n));
	}
}
