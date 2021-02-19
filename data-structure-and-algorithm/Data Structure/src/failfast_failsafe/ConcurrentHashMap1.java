package failfast_failsafe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap1 {
	public static void main(String[] args) {
		//Map m = new ConcurrentHashMap();
		ConcurrentMap m = new ConcurrentHashMap();
		m.put(101, "A");
		m.put(102, "B");
		m.putIfAbsent(103, "C");
		m.putIfAbsent(101, "D");
		//m.remove(101, "D");
		m.replace(103, "C","D");
		System.out.println(m);
	}

}
