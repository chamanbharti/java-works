package synchronise;

import java.util.*;


public class SynchronizeSet {
	
	public static void main(String[] args) {
	//creating non synchronized HashSet object
		HashSet<String>hs=new HashSet<>();
		
		hs.add("JAVA");
		hs.add("STRUTS");
		hs.add("JSP");
		hs.add("SERVLETS");
		hs.add("JSF");
        //getting synchronized list
        Set<String> synchronizedSet = Collections.synchronizedSet(hs);
        //you must use synchronized block while iterating over synchronizedSet
        synchronized (synchronizedSet) {
			Iterator<String>it=synchronizedSet.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
        /*for(String s:synchronizedSet){
        	System.out.println(s);
        }*/
}

}
