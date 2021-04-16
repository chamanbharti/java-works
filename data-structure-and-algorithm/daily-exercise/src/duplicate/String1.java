package duplicate;

import java.io.IOException;

public class String1 {

	public static void main(String[] args) throws IOException{
		
		 String s= "A3a4d3s7w3s2t3U#v+w*x%y2]z";
	        for(int i=0;i<s.length();i++){
				
				int ch = s.charAt(i);
				
				if(ch>=65 && ch <=90){
					//ch = ch+32;
					System.out.print((char)ch);
				}else if(ch>=97 && ch<=122) {
					//ch = ch-32;
					System.out.print((char)ch);
				}
				
				/*if(ch == 32){//21 is place of space
					System.out.println(" ");
				}*/
				
			}
		
	}
}
