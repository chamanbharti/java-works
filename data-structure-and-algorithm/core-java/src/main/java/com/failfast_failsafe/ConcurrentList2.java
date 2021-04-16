package failfast_failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentList2 {
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        //get iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
        	System.out.println("List is :"+list);
        	String str = itr.next();
        	System.out.println(str);
        	
        	if(str.equals("2")){
        		list.remove("5");
        	}
        	
        	/*if(str.equals("2")){
        		itr.remove();//UnsupportedOperationException
        	}*/
        	
        	
        	if(str.equals("3")){
        		list.add("3 found");
        	}
        	if(str.equals("4")) 
        		list.set(1, "4");
       }
	}

}
/*List is :[1, 2, 3, 4, 5]
1
List is :[1, 2, 3, 4, 5]
2
List is :[1, 2, 3, 4]
3
List is :[1, 2, 3, 4, 3 found]
4
List is :[1, 4, 3, 4, 3 found]
5
 * */