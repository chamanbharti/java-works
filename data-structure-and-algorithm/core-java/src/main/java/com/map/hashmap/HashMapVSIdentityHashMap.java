package map.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

class Temp{
	
	public String toString(){
		return "temp";
	}
	public void finalize(){
		System.out.println("Finalise method called");
	}
}

public class HashMapVSIdentityHashMap {
	public static void main(String[] args) throws InterruptedException {
		
		/*//HashMap hm = new HashMap();//it uses I1.equals(I2) and output is {10=Chaman}
		IdentityHashMap hm = new IdentityHashMap();//it uses I1 == I2 and output is {10=Chaman,10=Chaman}
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		//hm.put(null, "Chaman");
		hm.put(I1, "Chaman");
		hm.put(I2, "Chaman");
		System.out.println(hm);*/
		
		/*HashMap hm = new HashMap();
		Temp t = new Temp();
		hm.put(t, "Chaman");
		System.out.println(hm);//{temp=Chaman}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hm);//{temp=Chaman}
		 */	
		WeakHashMap hm = new WeakHashMap();
		Temp t = new Temp();
		hm.put(t, "Chaman");
		System.out.println(hm);//{temp=Chaman}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hm);//{}
		}
		 
		
}
