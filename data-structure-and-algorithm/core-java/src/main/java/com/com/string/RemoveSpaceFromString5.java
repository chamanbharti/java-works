package com.string;

public class RemoveSpaceFromString5 {
public static void main(String[] args) {
	String s=" Chaman Bharti ";
	
	//step 1
	String removedSpace=s.replaceAll("\\s", "");
	System.out.println(removedSpace);
	
	//step 2
	char[] cArray=s.toCharArray();
	StringBuffer sf=new StringBuffer();
	for(int i=0;i<s.length();i++){
		if( (cArray[i]!=' ') && (cArray[i]!='\t')){
			sf.append(cArray[i]);
		}
	}
	
	//step 3
	char[] strArray2 = s.toCharArray();
	StringBuffer sb2 = new StringBuffer();
	for(char c:strArray2){
		if(!Character.isWhitespace(c)){
			sb2.append(c);
		}
	}
	System.out.println(sb2);
	
	//System.out.println(sf);
	String removedSpace2=sf.toString();
	System.out.println(removedSpace2);
	
}
}
