package duplicate.remove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayList1 {
	
	static ArrayList<Integer> al = new ArrayList<>();
	static Set<Integer> al2=new HashSet<>();
	public static void main(String[] args) {
		
		al.add(1);
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(2);
		removeDuplicate();
		System.out.println("After remove duplicate Element:");
		for(Integer i:al2) {
			System.out.println(i);
		}
	}
	public static void removeDuplicate() {
		
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i) == al.get(j)) {
					al2.addAll(al);
				}
			}
		}
	}
}
