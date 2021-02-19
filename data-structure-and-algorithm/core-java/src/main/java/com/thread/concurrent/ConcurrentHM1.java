package thread.concurrent;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM1 {

	public static void main(String[] args) {
		HashMap<Integer,String>chm = new HashMap<>();
		chm.put(101, "A");
		chm.put(102, "B");
		chm.putIfAbsent(103, "C");
		chm.putIfAbsent(101, "D");
		chm.remove(101, "D");
		chm.replace(102, "B","E");
		System.out.println(chm);
	}
}
