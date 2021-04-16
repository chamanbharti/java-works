package ds.linear.arraylist;

class ArrayList {

	int arr[] = null;
	int capacity = 5;
	int size = 0;
	
	public ArrayList() {
		this.arr = new int[capacity];
	}
	
	public ArrayList(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	private void ensureCapacity() {
		if(size == capacity) {
			System.out.println("ArrayContainer Overflow");
			//using formula to prevent AIOBE
//			capacity = capacity + (capacity/2);
			capacity = capacity + (capacity >> 1);
			System.out.println("The new capacity is "+capacity);
			int newArray[] = new int[capacity];
			for(int i=0;i<size;i++) {
				newArray[i] = arr[i];
			}
			this.arr = newArray;
		}
	}
	
	public void add(int data) {
		
		ensureCapacity();
		//arr[size] = data;
		//size = size + 1;
		arr[size++] = data;
		//using size insert data into array arr[size] = data
		//increase the size +1
		System.out.println(data+" inserted into list");
		
	}
	
	public void add(int data,int index) {
		if(index > size-1) {
			System.out.println("index out of bound");
			return;
		}
		ensureCapacity();
		for(int i=size;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = data;
		size++;
		System.out.println(data+" inserted into list");
		
	}
	
	public void remove(int index) {
		if(index > (size-1) || index < 0) {
			System.out.println("index out of bound");
			return;
		}
		int data = arr[index];
		//You have swap up the elements
		for (int i = index; i < size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		System.out.println(data+" removed from list");
	}
	
	public void removeObject(int data) {
		int targetIndex = indexOf(data);
		remove(targetIndex);
	}
	
	
	public int indexOf(int data) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if(arr[i] == data) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int lastIndexOf(int data) {
		int index = -1;
		for (int i = size; i>=0; i--) {
			if(arr[i] == data) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public boolean contains(int data) {
		return indexOf(data) != -1;
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public void clear() {
		this.size = 0;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(arr[i]).append(",");
		}
		if(sb.length() > 1) {
			sb.deleteCharAt(sb.length() -1);
		}
		sb.append("]");
		return sb.toString();
	}
	
}

public class ArrayListDS{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		System.out.println(al);
		al.add(40, 1);
		System.out.println(al);
		al.add(50);
		System.out.println(al);
		al.add(60);
		al.add(70);
		System.out.println(al);
		al.add(80,0);
		System.out.println(al);
		
		System.out.println("index of 80 is "+al.indexOf(80));
		System.out.println("last index of 30 is "+al.lastIndexOf(30));
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		al.removeObject(50);
		System.out.println("30 is contains?"+al.contains(30));
		System.out.println("size of arraylist?"+al.size());
		System.out.println("arraylist isEmpty?"+al.isEmpty());
		al.clear();
		System.out.println("size of arraylist?"+al.size());
		System.out.println("arraylist isEmpty?"+al.isEmpty());
		System.out.println(al);
		
	}
}
