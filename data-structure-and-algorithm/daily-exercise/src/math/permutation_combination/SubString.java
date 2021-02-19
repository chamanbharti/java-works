package math.permutation_combination;

public class SubString {

	public static void main(String[] args) {
		String s1 = "chaman";
		System.out.println(s1.substring(2));//returns aman
		System.out.println(s1.substring(2, 4));//returns am
		System.out.println(s1.substring(0, 6));//returns chaman
		//System.out.println(s1.substring(0, 7));//returns exception java.lang.StringIndexOutOfBoundsException: begin 0, end 7, length 6
		//StringIndexOutOfBoundsException if start index is negative value or end index is lower than starting index.
		//System.out.println(s1.substring(-1, 6));
		//System.out.println(s1.substring(1, -6));
		System.out.println(s1.substring(1, 0));
	}
}
