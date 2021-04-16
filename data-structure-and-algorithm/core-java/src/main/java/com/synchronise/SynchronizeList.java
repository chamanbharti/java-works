package synchronise;

import java.util.*;


public class SynchronizeList {
	
	public static void main(String[] args) {
	//creating non synchronized arraylist object
		ArrayList<String>list=new ArrayList<>();
		
		list.add("JAVA");
        list.add("STRUTS");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JSF");
        //getting synchronized list
        List<String> synchronizedList = Collections.synchronizedList(list);
        //you must use synchronized block while iterating over synchronizedList
        /*synchronized (synchronizedList) {
			Iterator<String>it=synchronizedList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}*/
        for(String s:synchronizedList){
        	System.out.println(s);
        }
}

}
