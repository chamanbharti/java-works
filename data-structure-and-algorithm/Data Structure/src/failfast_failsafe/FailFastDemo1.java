package failfast_failsafe;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		//this thread will iterate the list
		Thread t1 = new Thread(){
			public void run(){
				try{
					Iterator<String> i = list.iterator();
					while(i.hasNext()){
						System.out.println(i.next());
						//using sleep to simulate concurrencey
						Thread.sleep(1000);
					}
				}catch(ConcurrentModificationException e){
					System.out.println("Thread-1: Concurrent modification detected on this list");
					e.printStackTrace();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		t1.start();
		
		//this thread will try to add the collection.
		//while the collection is iterated by another thread
		Thread t2 = new Thread(){
			public void run(){
				try{
					//using sleep to simulate concurrency
					Thread.sleep(2000);
					//adding new value to the shared list
					System.out.println(list);//[1, 2, 3, 4]
					list.add("5");
					System.out.println("New value added to the list");
					//System.out.println(list);//[1, 2, 3, 4, 5]
				}catch(ConcurrentModificationException e){
					System.out.println("Thread-2 :Concurrent modification detected on the list");
					e.printStackTrace();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(list);//[1, 2, 3, 4, 5]
			}
		};
		
		t2.start();
	}

}
