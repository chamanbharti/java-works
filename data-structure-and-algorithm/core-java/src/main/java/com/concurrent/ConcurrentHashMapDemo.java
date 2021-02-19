package thread.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String>chm = new ConcurrentHashMap<>();
		chm.put(101, "Chaman");
		chm.put(101, "Bharti");
		System.out.println(chm);//{101=Chaman}
		chm.putIfAbsent(101, "Rahi");
		System.out.println(chm);//{101=Chaman}
	}
}
