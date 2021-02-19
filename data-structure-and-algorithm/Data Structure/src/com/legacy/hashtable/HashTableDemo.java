package com.legacy.hashtable;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		System.out.println("\t****Hashtable Collection Class Demo****");
		
		//create hash table
		//Hashtable ht = new Hashtable();// jdk 1.4 style
		//Hashtable<Integer, String> ht = new Hashtable<Integer, String>();// jdk 1.5 Generic style
		Hashtable<Integer, String> ht = new Hashtable<>();// jdk 1.8 style
		
		//put values into the table
		ht.put(1, "Rahi");
		ht.put(2, "Chaman");
		ht.put(3, "Sahil");
		ht.put(4, "Aman");
		ht.put(5, "Naman");
		
		//check table content
		System.out.println(" \t Hashtable initial content:" +ht);//Hashtable content:{5=Naman, 4=Aman, 3=Sahil, 2=Chaman, 1=Rahi}
		 	
		/*//public void clear()
		//This method clears this hashtable so that it contains no keys.
		System.out.println(" \t *** clear() ***");
		//clear the table
		ht.clear();
		//check the table content after clear
		System.out.println(" \t Hashtable content after clear: " +ht);//{}
		*/
		
		/*//public Object clone()
        //This method create a shallow copy of this hashtable
		System.out.println(" \t *** clone() ***");
		//create clone hashtable
		Hashtable<Integer, String> htclone = new Hashtable<>();
		//clone hashtable
		htclone = (Hashtable<Integer, String>) ht.
		clone();
		//htclone=(Hashtable)ht.clone();
		
		//check content after clone
		System.out.println(" \t Clone table content: " +htclone);// Clone table content: {5=Naman, 4=Aman, 3=Sahil, 2=Chaman, 1=Rahi}
		 */		
		
		/*//public boolean contains(Object value)
		//This method tests if some key maps into the specified value in this hashtable.	
		System.out.println(" \t *** contains() ***");
		//check if hash table contains "Chaman"
		//boolean isAvailable = ht.contains(null);//java.lang.NullPointerException
		boolean isAvailable = ht.contains("Chaman");
		
		
		//Display search result
		System.out.println(" \t Hashtable contains 'Chaman' : " + isAvailable);//true
		*/		
		
		/*//public boolean containsKey(Object key)
		//This method tests if the specified object is a key in this hashtable.
		System.out.println(" \t *** containsKey() ***");
		//check if hashtable contains key "3"
		//boolean isAvailable = ht.containsKey(null);//java.lang.NullPointerException
		boolean isAvailable = ht.containsKey(3);
		
		//Display search result
		System.out.println(" \t Hashtable contains key '3' : " + isAvailable);//true
		 */	
		
		/*//public boolean containsValue(Object value)
		//This method returns true if this hashtable maps one or more keys to this value.
		System.out.println(" \t *** containsValue() ***");
		//check if hashtable contains "Rahi"
		boolean isAvailable = ht.containsValue("Rahi");
		
		//Display search result
		System.out.println(" \t Hashtabl contains value 'Rahi' : " + isAvailable);//true
		 */	
		
		/*//public Enumeration<V> elements()
		//This method returns an enumeration of the values in this hashtable.
		System.out.println(" \t *** elements() ***");
		//create enumeration
		Enumeration e = ht.elements();
		System.out.println(" \t Display result : ");
		
		//Display search result
		while(e.hasMoreElements()){
			System.out.println(" \t " + e.nextElement());
		}*/
		
		/*//public Set<Map.Entry<K,V>> entrySet()
		//This method returns a Set view of the mappings contained in this map.	
		System.out.println(" \t *** entrySet() ***");
		//create a set view
		Set set = ht.entrySet();
		
		//Dispaly set result
		System.out.println(" \t Set result : " + set);//[5=Naman, 4=Aman, 3=Sahil, 2=Chaman, 1=Rahi]
		 */	
		
		/*//public boolean equals(Object o)
		//This method compares the specified Object with this Map for equality, as per the definition in the Map interface.
		System.out.println(" \t *** equals() ***");
		//create two hashtable
		Hashtable<Integer, String> ht1 = new Hashtable<>();// jdk 1.8 style
		Hashtable<Integer, String> ht2 = new Hashtable<>();// jdk 1.8 style
		
		//put values into the table
		ht1.put(1, "Rahi");
		ht1.put(2, "Chaman");
		ht1.put(3, "Sahil");
		ht1.put(4, "Aman");
		ht1.put(5, "Naman");
		
		ht2.put(1, "Rahi");
		ht2.put(2, "Chaman");
		ht2.put(3, "Sahil");
		ht2.put(4, "Aman");
		ht2.put(5, "Naman");
		
		// display both table's contents
		System.out.println(" \t Hashtable initial content:" +ht1);
		System.out.println(" \t Hashtable initial content:" +ht2);
		System.out.println(" \t Hash Code value is : " + ht1.hashCode());
		System.out.println(" \t Hash Code value is : " + ht2.hashCode());
		//check equality
		boolean isEqual = ht1.equals(ht2);
		
		//Display result
		System.out.println(" \t Are two tables equal ? : " + isEqual);//true
		*/
		
		/*//public V get(Object key)
		//This method returns the value to which the specified key is mapped, or null 
		//if this map contains no mapping for the key.
		System.out.println(" \t *** get() ***");
		//get values at key 3
		System.out.println(" \t Values at key 3 is : " + ht.get(3));//Sahil
		*/
		
		/*//public int hashCode()
		//This method returns the hash code value for this Map as per the definition in the Map interface.
		System.out.println(" \t *** hashCode() ***");
		//get the hash code value
		System.out.println(" \t Hash Code value is : " + ht.hashCode());*/
		
		/*//public boolean isEmpty()
		//This method tests if this hashtable maps no keys to values.
		System.out.println(" \t *** isEmpty() ***");
		//check if table is empty
		System.out.println(" \t Is hashtable empty ? : " + ht.isEmpty());//false
		*/
		
		/*//public Enumeration<K> keys()
		//This method returns an enumeration of the keys in this hashtable.
		System.out.println(" \t *** keys() ***");
		//create enumeration for keys
		//Enumeration e = ht.elements();//for element
		Enumeration e = ht.keys();//for key
		System.out.println(" \t Display result : ");
		//display search result
		while(e.hasMoreElements()){
			System.out.println(" \t " + e.nextElement());
		}
		*/
		
		/*//public Set<K> keySet()
		//This method returns a Set view of the keys contained in this map.
		System.out.println(" \t *** keySet() ***");
		//create a set view
		//Set set = ht.entrySet(); //for key-value pair
		Set set = ht.keySet();     //for only key
		Object value = ht.values();               //for only value
		//display result
		System.out.println(" \t Display result : " + set);
		System.out.println(" \t Display result : " + value);
		*/
		
		/*//public V put(K key, V value)
		//This method maps the specified key to the specified value in this hashtable.
		System.out.println(" \t *** put() ***");
		//// create hash table 
		Hashtable htable1 = new Hashtable();      
	      
		// put values in table
		 htable1.put(1, "A");
		 htable1.put(2, "B");
		 htable1.put(3, "C");
		 htable1.put(4, "D");
		 System.out.println(" \t Initial hash table value: "+htable1);
		 //put the value at key 4
		 
		//NullPointerException -- This is thrown if the key or value is null.
		 //String returnVal = (String)htable1.put(null, "TP");
		// String returnVal = (String)htable1.put(4, null);
		String returnVal = (String)htable1.put(4, "TP");
		 System.out.println(" \t Return value : " + returnVal);//D
		 System.out.println(" \t New hash table value : " + htable1);//{4=TP, 3=C, 2=B, 1=A}
		 */
		 
		/*//public void putAll(Map<? extends K,? extends V> t)
		//This method copies all of the mappings from the specified map to this hashtable.
		System.out.println(" \t *** putAll() ***");
		// create hash table 
		   Hashtable htable1 = new Hashtable(); 
		      
		   // create Map
		   Map map=new HashMap();
		   //Hashtable map=new Hashtable();
		      
		   // put values in map
		   map.put("1","TP");
		   map.put("2","IS");
		   map.put("3","BEST");
		          
		   System.out.println(" \t Initial hash table value: "+htable1);//{}
		   System.out.println(" \t Map values: "+map);
		      
		   // put map values in table
		   htable1.putAll(map);
		   System.out.println(" \t Hash table value after put all: "+htable1);//{3=BEST, 2=IS, 1=TP}
		   
		   */
		 
		/*//protected void rehash()
		
		 * This method increases the capacity of and internally reorganizes this hashtable, 
		 * in order to accommodate and access its entries more efficiently.
		 
		System.out.println(" \t *** rehash() ***");
		This is a protected method and called automatically 
		when the number of keys in the hashtable exceeds this hashtable's capacity.
		So the stand alone application can not be used to test the method.
		*/
		
		/*//public V remove(Object key)
		//This method removes the key (and its corresponding value) from this hashtable.
		System.out.println(" \t *** remove() ***");
		 // create hash table 
		   Hashtable ht3 = new Hashtable(3); 
		      
		   // populate the table
		   ht3.put(1, "TP");
		   ht3.put(2, "IS");
		   ht3.put(3, "THE");
		   ht3.put(4, "BEST");
		   ht3.put(5, "TUTORIAL");
		      
		   System.out.println(" \t Initial hash table value: "+ht3);
		      
		   // remove element at key 3
		   ht3.remove(3);
		 //NullPointerException -- This is thrown if the specified key is null.
		   //ht3.remove(null);
		          
		   System.out.println(" \t Hash table value after remove: "+ht3);
		   */
		
		/*//public int size()
		//This method returns the number of keys in this hashtable.
		System.out.println(" \t *** size() ***");
		//diplay size of hashtable
		System.out.println(" \t Size of hashtable : " + ht.size());//5
		*/
		
		/*//public String toString()
		
		 * This method returns a string representation of this Hashtable object in the form of a set of 
		 * entries, enclosed in braces and separated by the ASCII characters ", " (comma and space).
		 
		System.out.println(" \t *** toString() ***");
		//display a string form of hashtable object
		System.out.println(" \t String form of hashtable is : " + ht.toString());
		*/
		
		/*//public Collection<V> values()
		//This method returns a Collection view of the values contained in this map.
		System.out.println(" \t *** values() ***");
		//display values
		System.out.println(" \t Collection view of hashtable : " + ht.values());//[Naman, Aman, Sahil, Chaman, Rahi]
		*/
		   
		
	}

}
