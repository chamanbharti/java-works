package ds.map.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortByKeyAndValue {

	public static void main(String[] args) {
		
		//sort by key
		//implementation of HashMap  
		HashMap<Integer, String> unsortMap=new HashMap<Integer, String>();  
		//addding keys and values to HashMap  
		unsortMap.put(23, "Yash");  
		unsortMap.put(17, "Arun");  
		unsortMap.put(15, "Swarit");  
		unsortMap.put(9, "Neelesh");  
		
		
//		System.out.println("sort by key >> \nBefore sorting");
//		Iterator<Integer> it = hm.keySet().iterator();
//		while(it.hasNext()) {
//			int key = (int)it.next();
//			System.out.println("Roll No:"+key+" Name:"+hm.get(key));
//		}
//		printMap(unsortMap);
//		System.out.println("After Sorting");
		//using TreeMap constructor to sort the HashMap  
		//ascending order
//		Map<Integer,String>tm = new TreeMap<>(hm);
//		printMap(tm);
//		//descending order step 1
//		Map<Integer,String>treeMap = new TreeMap<>(
//					 new Comparator<Integer>() {
//
//						@Override
//						public int compare(Integer o1, Integer o2) {
//							return o2.compareTo(o1);
//						}
//						 
//					 }
//					);
//		treeMap.putAll(unsortMap);
//		printMap(treeMap);
		
		//descending order step 2
		//for java 8, try this lambda
//		Map<Integer,String>treeMap = new TreeMap<>(
//					//(Comparator<Integer>) (o1,o2)->o2.compareTo(o1)
//						(o1,o2)->o2.compareTo(o1)
//					);
//		treeMap.putAll(unsortMap);
//		printMap(treeMap);
	
		//sort by value
//		System.out.println("sort by value >> \nBefore Sorting:");  
//		Set set = hm.entrySet();
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Map.Entry entry = (Map.Entry)iterator.next();
//			System.out.println("Roll No:"+entry.getKey()+" Name:"+entry.getValue());
//		}
		
		//step 1
//		Map<Integer, String> map = sortValues(hm);   
//		System.out.println("After Sorting:");  
//		Set set2 = map.entrySet();  
//		Iterator iterator2 = set2.iterator();  
//		while(iterator2.hasNext())   
//		{  
//			Map.Entry me2 = (Map.Entry)iterator2.next();  
//			System.out.println("Roll no:  "+me2.getKey()+"     Name:   "+me2.getValue());  
//		}  

		//step 2
		 System.out.println("\nSorted Map......By Value");
        //Map<Integer,String> sortedMap = sortByValue(unsortMap);
        Map<Integer,String> sortedMap = sortByValueUsingGeneric(unsortMap);//using generic
        printMap(sortedMap);

	}
	
	//method to sort values  
//	private static HashMap sortValues(HashMap map)   
//	{   
//		List list = new LinkedList(map.entrySet());  
//		//Custom Comparator  
//		Collections.sort(list, new Comparator()   
//		{  
//			public int compare(Object o1, Object o2)   
//			{  
//					return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
//			}  
//		});  
//		//copying the sorted list in HashMap to preserve the iteration order  
//		HashMap sortedHashMap = new LinkedHashMap();  
//		for (Iterator it = list.iterator(); it.hasNext();)   
//		{  
//			 Map.Entry entry = (Map.Entry) it.next();  
//			sortedHashMap.put(entry.getKey(), entry.getValue());  
//		}   
//		return sortedHashMap;  
	public static Map<Integer,String> sortByValue(Map<Integer,String> unsortedMap){
		//1 convert map to list of map
		List<Map.Entry<Integer,String>>list = new LinkedList<Map.Entry<Integer,String>>(unsortedMap.entrySet());
		  // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>(){
			public int compare(
					Map.Entry<Integer,String> o1,
					Map.Entry<Integer,String> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		Map<Integer,String>sortedMap = new LinkedHashMap<Integer,String>();
		  // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
//		for(Map.Entry<Integer,String>entry:list) {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
		
		//classic iterator example
		for(Iterator<Map.Entry<Integer, String>>it=list.iterator();it.hasNext();) {
			Map.Entry<Integer,String>entry=it.next();
			sortedMap.put(entry.getKey(),entry.getValue());
		}
		return sortedMap;
	}
	//sort by value using generic
	public static <K,V extends Comparable<? super V>> Map<K,V> sortByValueUsingGeneric(Map<K,V> unsortMap){
		List<Map.Entry<K,V>>list = new LinkedList<Map.Entry<K,V>>(unsortMap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(
					Map.Entry<K, V> o1,
					Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		Map<K,V> result = new LinkedHashMap<K, V>();
		for(Map.Entry<K, V>entry:list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	//print map
	public static <K,V> void printMap(Map<K,V> map) {
		for(Map.Entry<K, V> entry:map.entrySet()) {
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
		}
	}
}
