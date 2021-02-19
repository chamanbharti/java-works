package conversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//http://javaconceptoftheday.com/how-to-convert-hashmap-to-arraylist-in-java/
public class HashMapConversion {

	public static void main(String[] args) {
		//Conversion Of HashMap Keys Into ArrayList :
		/*
		 *For this, we use keySet() method of HashMap which returns the Set containing 
		 *all keys of the HashMap. And then we pass this Set while constructing the ArrayList.
		 */
		HashMap<String,Integer>map=new HashMap<>();
		
		map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.put("FIVE", 5);
        
        //getting Set of keys from HashMap
        System.out.println("....keySet()....");
        Set<String>keySet = map.keySet();
        //creating an ArrayList of keys by passing the keySet
        ArrayList<String>listOfKeys = new ArrayList<>(keySet);
        System.out.println(listOfKeys);
        System.out.println("..................");
        
        // Conversion Of HashMap Values Into ArrayList :
        HashMap<String,String>map1=new HashMap<>();
        map1.put("ONE", "1");
        map1.put("TWO", "2");
        map1.put("THREE", "3");
        map1.put("FOUR", "4");
        map1.put("FIVE", "5");
        
        System.out.println("....values()....");
        Collection<String> values = map1.values();
        //creating an arraylist of values
        ArrayList<String>listOfValues = new ArrayList<String>(values);
        System.out.println(listOfValues);
        System.out.println("..................");
        
        //Conversion Of HashMap’s Key-Value Pairs Into ArrayList :
        //getting the set of entries
        System.out.println("....HashMap’s Key-Value Pairs Into ArrayList....");
        Set<Entry<String, String>> entrySet = map1.entrySet();
        //creating ArrayList of Entry objects
        ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String, String>>(entrySet);
        System.out.println(listOfEntry);
        System.out.println("..................");
	}
}
