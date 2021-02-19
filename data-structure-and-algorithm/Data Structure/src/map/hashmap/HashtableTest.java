package map.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Tep{
	int i;
	public Tep(int i){
		this.i = i;
	}
	public int hashCode(){
		//return i;
		//return i%9;
		return i;
	}
	public String toString(){
		return i+"";
	}
}

public class HashtableTest {

	public static void main(String[] args) {
		
		HashMap<Tep, String> hm = new HashMap<>();
		
		hm.put(new Tep(5), "Rahi");
		hm.put(new Tep(2), "Chaman");
		hm.put(new Tep(6), "Sahil");
		hm.put(new Tep(15), "Aman");
		hm.put(new Tep(23), "Naman");
		hm.put(new Tep(16), "Saima");
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
