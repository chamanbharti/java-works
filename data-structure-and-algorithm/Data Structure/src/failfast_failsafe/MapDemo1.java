package failfast_failsafe;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<Integer, String>m=new Hashtable<Integer, String>();
		/*//traditional collection
		m.put(101, "durga");
		m.put(101, "chaman");
		System.out.println(m);//{101=chaman}
		*/
		//concurrent collection version 1.8
		//1.Object putIfAbsent(Object key,Object value)
		/*m.put(101, "durga");
		m.putIfAbsent(101, "chaman");
		System.out.println(m);//{101=durga}
		m.put(102, "bharti");
		m.putIfAbsent(103, "chaman bharti");
		System.out.println(m);//{103=chaman bharti, 102=bharti, 101=durga}
		 */	
		////traditional collection
		/*m.put(101, "durga");
		m.remove(101);
		System.out.println(m);//{}
		 */	
		/*//concurrent collection version 1.8
		//2.Object remove(Object key,Object value)
		m.put(101, "durga");
		m.put(102, "durgasoft");
		System.out.println(m);//{102=durgasoft, 101=durga}
		m.remove(102, "durgasoft");
		System.out.println(m);//{101=durga}
		 */	
		//concurrent collection version 1.8
		//2.Object replace(Object key,Object oldValue,Object newValue)
		m.put(101, "durga");
		m.replace(101, "shiva","ravi");
		System.out.println(m);//{101=durga}
		m.replace(101, "durga","ravi");
		System.out.println(m);//{101=ravi}
		
	}
}
