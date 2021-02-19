package conversion;

import java.util.ArrayList;

public class ArrayListToArray2 {
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        //converting arraylist to Array
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println("Array Elements");
        for(int i=0;i<array.length;i++){
        	System.out.println(array[i]);
        }
	}

}
