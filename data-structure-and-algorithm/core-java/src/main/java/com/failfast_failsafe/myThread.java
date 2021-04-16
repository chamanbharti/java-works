package failfast_failsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public class myThread extends Thread{
	
	static ArrayList<String> l=new ArrayList<String>();
	@Override
	public void run() {
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException i){
			i.printStackTrace();
		}
		System.out.println("Child Thread Updating List");
		l.add("D");
	}
	
	public static void main(String[] args) throws InterruptedException{
		l.add("A");
		l.add("B");
		l.add("C");
		myThread t=new myThread();
		t.start();
		Iterator<String>itr=l.iterator();
		while(itr.hasNext()){
			String s1=(String)itr.next();
			System.out.println("Main thread iterating List and Current Object is: "+s1);
			sleep(3000);
		}
		System.out.println(l);
	}

}
