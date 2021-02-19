package failfast_failsafe;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo2 {
	public static void main(String[] args) {
		
		List<String>list = new CopyOnWriteArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		//this thread will iterate the list
		Thread t1 = new Thread(){
			
			public void run(){
				try{
					Iterator<String>i=list.iterator();
					System.out.println("List before adding : "+list);
					while(i.hasNext()){
						System.out.println(i.next());
						//using sleep to simulate concurrency
						Thread.sleep(1000);
					}
				}catch(ConcurrentModificationException e){
					System.out.println("Thread-1: Concurrent modification detected on list");
				    e.printStackTrace();
				}catch(InterruptedException e){}
			}
		};
		t1.start();
		
		//this thread will try to add new value to collection,
		//while the collection is iterated by another thread.
		Thread t2 = new Thread(){
			public void run(){
				try{
					//using sleep to simulate concurrency
					Thread.sleep(2000);
					//adding new value to shared list
					list.add("5");
					list.remove("3");
					System.out.println("Find data: "+list.get(1));
					System.out.println("New value added to the list");
					System.out.println("List after adding : "+list);
					
				}catch (ConcurrentModificationException e) {
					System.out.println("Thread-2: Concurrent modification detected on list");
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		t2.start();
	}

}
