package java10;

import java.util.ArrayList;
import java.util.List;

public class VarExample {
	public static void main(String[] args) {
		
		//int i=10;
		var i = 10;
		System.out.println(i);
		var name="chaman";
		System.out.println(name);
		//List<String> names = new ArrayList<>();
//		var names = new ArrayList<String>();
		var names = new ArrayList<>();
		names.add("a");
		System.out.println(names);
	}

}
