package regrex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExression1 {
	public static void main(String[] args) {
		//1st way
		Pattern p = Pattern.compile(".s");//. represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);
		//2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		//3rd way 
		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(b3);
		
	}

}
