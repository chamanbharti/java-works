package duplicate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class String4 {

	public static void main(String[] args) {
		
		printDuplicate("Chaman Bharti");
	}
	public static void printDuplicate(String str) {
		char[] characters = str.toCharArray();
		
		Map<Character, Integer>map = new HashMap<>();
		for(Character ch:characters) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>>entrySet = map.entrySet();
		System.out.println("List of duplicate characters in string "+str);
		for(Map.Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue() > 1) {
				//System.out.printf("%s : %d %n",entry.getKey(), entry.getValue());
				System.out.println(entry.getKey()+":"+ entry.getValue());
			}
		}
	}
}
