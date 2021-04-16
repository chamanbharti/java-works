package duplicate;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	static List<String> al = new ArrayList<>();
	
	public static void main(String[] args) {
		
		al.add("A");
		al.add("B");
		al.add("A");
		int count = countDuplicates();
		System.out.println("Duplicate Element is:"+count);
	}
	public static int countDuplicates() {
		int duplicate = 0;
		for(int i=0;i<=al.size()-1;i++) {
			boolean found=false;
			for(int j = i+1; !found && j<al.size();j++) {
				if(al.get(i)==(al.get(j))) {
					found = true;
					duplicate++;
				}
			}
		}
		return duplicate;
	}
}
