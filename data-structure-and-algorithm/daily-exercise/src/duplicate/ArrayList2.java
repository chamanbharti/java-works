package duplicate;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	static List<Integer> al = new ArrayList<>();
	
	public static void main(String[] args) {
		
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(2);
		al.add(1);
		
		int count = duplicateCounts();
		System.out.println("Duplicate Element:"+count);
	}
	
	static int duplicateCounts() {
		
		int duplicate = 0;
		
		for(int i=0;i<al.size()-1;i++) {
			boolean found = false;
			for(int j=i+1;!found && j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					found = true;
					duplicate++;
				}
			}
		}
		return duplicate;
	}
}
