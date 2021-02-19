package conversion;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		
		list.add("JAVA");
        list.add("STRUTS");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JSF");
        
        //converting arraylist to Array
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("Array Elements");
        for(int i=0;i<array.length;i++){
        	System.out.println(array[i]);
        }
	}

}
