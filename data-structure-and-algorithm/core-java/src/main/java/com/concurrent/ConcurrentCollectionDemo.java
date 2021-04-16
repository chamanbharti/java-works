package thread.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

class ConcurrentCollectionDemo extends Thread{
	//static ArrayList<String> al= new ArrayList<>();//ConcurrentModificationException
	static CopyOnWriteArrayList<String> al= new CopyOnWriteArrayList<>();//No ConcurrentModificationException
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child thread updating");
		al.add("D");
	}
	public static void main(String[] args) throws InterruptedException{
		al.add("A");
		al.add("B");
		al.add("C");
		ConcurrentCollectionDemo obj = new ConcurrentCollectionDemo();
		obj.start();
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String s1 = (String)itr.next();
			System.out.println("Main thread iterating list and current object  is:"+s1);
			Thread.sleep(3000);
		}
		System.out.println(al);
		
	}
}
