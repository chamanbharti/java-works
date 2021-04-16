package com.immutable;

public class StringImmutable {
	public static void main(String[] args) {
		
		/*String s1 = "JAVA";
		String s2 = "JAVA";
		
		System.out.println(s1 == s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode());//2269730
		System.out.println(s2.hashCode());//2269730
		
		s1 = s1 + "J2EE";
		
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.hashCode());//201533674
		System.out.println(s2.hashCode());//2269730
		 */
		
		String s1 = new String("JAVA");
		System.out.println(s1);//JAVA
		System.out.println(s1.hashCode());//2269730
		
		s1.concat("J2EE");
		System.out.println(s1);//JAVA
		System.out.println(s1.hashCode());//2269730
		
		s1 = s1.concat("J2EE");
		System.out.println(s1);//JAVA
		System.out.println(s1.hashCode());//201533674
		}

}
