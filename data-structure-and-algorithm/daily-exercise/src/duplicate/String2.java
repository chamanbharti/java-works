package duplicate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string:");
		String name = br.readLine();
		int len = name.length();
		char ch = 0;
		int count = 0;
		System.out.println("Duplicate Character is ");
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(name.charAt(i) == name.charAt(j)) {
					if( ch != name.charAt(j)) {
						count++;
						ch = name.charAt(i);
						System.out.print(ch+" ");
						break;
					}
				}
			}
			
			
		}
		System.out.println("\nTotal duplicate:"+count);
		
	}
}
