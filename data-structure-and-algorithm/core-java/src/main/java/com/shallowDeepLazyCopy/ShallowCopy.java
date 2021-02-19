package shallowDeepLazyCopy;

import java.util.Arrays;

class Shallow{
	private int[] data ;
	
	//make a shallow copy of values
	public Shallow(int[] values) {
		data = values;
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
	
}
class Deep{
	private int[] data ;
	
	// altered to make a deep copy of values
	public Deep(int[] values) {
		data = new int[values.length];
		for(int i=0;i<data.length;i++) {
			data[i] = values[i];
		}
	}
	
	public void showData() {
		System.out.println(Arrays.toString(data));
	}
	
}
public class ShallowCopy {

	public static void main(String[] args) {
		
		System.out.println("Shallow Copy");
		int[] vals1 = {3,7,9};
		Shallow shallow = new Shallow(vals1);
		shallow.showData();//[3, 7, 9]
		vals1[0] = 13;
		shallow.showData();//[13, 7, 9]
		
		System.out.println("Deep Copy");
		int[] vals2 = {3,7,9};
		Deep deep = new Deep(vals2);
		deep.showData();//[3, 7, 9]
		vals2[0] = 13;
		deep.showData();//[3, 7, 9]
	}

}
