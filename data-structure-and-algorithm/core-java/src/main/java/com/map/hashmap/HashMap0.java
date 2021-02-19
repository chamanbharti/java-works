package map.hashmap;

import java.util.HashMap;

public class HashMap0 {

	public static void main(String[] args) {
		 HashMap<Integer, String>hp = new HashMap<>();
		 hp.put(1, "A");
		 hp.put(2, "B");
		 hp.put(1, "Chaman");
		 hp.put(null, null);
		 hp.put(null, "A");
		 System.out.println(hp);//{1=Chaman, 2=B}
		 
		 String oldValue=(String)hp.put(2, "Bharti");
		 System.out.println("oldValue:"+oldValue);//B
		 System.out.println(hp);//{1=Chaman, 2=Bharti}
		 String oldValue2=(String)hp.put(2, "Vandita");
		 System.out.println("oldValue:"+oldValue2);//Bharti
		 String oldValue3=(String)hp.put(3, "Vandita");
		 System.out.println("oldValue:"+oldValue3);//null
		 
		 //putAll
		 HashMap<Integer,String> hp2 = new HashMap<>();
		 hp2.put(1, "A");
		 hp2.put(2, "B");
		 hp2.put(3, "C");
		 
		 hp2.putAll(hp);
		 
		 //Collection views of map
		 //1 Set keySet()
		 //2 Collection values()
		 //3 Set entrySet()
		 
		 /*
		   interface Map{
		   
		   interface Entry{
			   Object getKey()
			   Object getValue()
			   Object setValue(Object new)
			   }
		   }
		   these 3 methods are entry specific methods and we can apply only on entry object
		   
		  */
	}
}
