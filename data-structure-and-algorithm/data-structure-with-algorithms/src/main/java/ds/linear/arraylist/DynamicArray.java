package ds.linear.arraylist;

class Array{
	
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void add(int item) {
		//if the array is  full, resize it, 
		if(items.length == count) {
			//create a new array (twice the size)
			int[] newItems = new int[count * 2];
			//copy all the existing items
			for (int i = 0; i < count; i++) {
				newItems[i] = items[i];
			}
			//set items to this new array
			items = newItems;
		}
		//add the new item at the end
		items[count++] = item;
	}
	
	public void remove(int index) {
		//validate the index
		if(index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		//shift the items to the left to  fill the hole
		for (int i = index; i < count; i++) {
			items[i] = items[i+1];
		}
	}
	
	public int indexOf(int item) {

//		int index = -1;
//		for (int i = 0; i < count; i++) {
//			if(items[i] == item) {
//				index = i;
//				break;
//			}
//		}
//		return index;
		
		//if we find it, return index, otherwise return -1
		//Best Case O(1)
		//Worst Case O(n)
		for (int i = 0; i < count; i++) 
			if(items[i] == item) 
				return i;
		return -1;
			
		
	}
	
	public void print() {
//		for (int i = 0; i < items.length; i++) {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
}
public class DynamicArray {
	public static void main(String[] args) {
		
		Array al = new Array(3);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//al.remove(5);
		System.out.println("index of "+al.indexOf(5));
		
		al.print();
	}
}
