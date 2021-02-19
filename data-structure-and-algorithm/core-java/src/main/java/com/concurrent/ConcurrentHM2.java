package thread.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM2 extends Thread{
	static Map<Integer,String>m = new ConcurrentHashMap<>();
//	static Map<Integer,String>m = new HashMap<>();//RE:Exception in thread "main" java.util.ConcurrentModificationException
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException IE) {
			IE.printStackTrace();
		}
		System.out.println("Child thread is updating map");
		m.put(103, "C");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		m.put(101, "A");
		m.put(102, "B");
		ConcurrentHM2 t = new ConcurrentHM2();
		t.start();
		Set set = m.keySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			System.out.println("Main thread iterating map and current entry is:"+i+".."+m.get(i));
			Thread.sleep(3000);
		}
		System.out.println(m);
	}
}
