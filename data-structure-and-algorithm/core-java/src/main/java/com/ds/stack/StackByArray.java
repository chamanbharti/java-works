package ds.stack;

public class StackByArray {
	
	int[] array;
	int topOfStack;//keeps track of the cell which is last occupied in array, this will help in insertion/deletion
	
	public StackByArray(int size) {
		this.array = new int[size];
		this.topOfStack = -1;
		System.out.println("Successfully created an empty Stack of Size: "+size);
	}
	
	public boolean isFullStack() {
		if(topOfStack == array.length-1) {
			System.out.println("Stack is full !");
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmptyStack() {
		//if top pointer is zero, the stack is empty
		if(topOfStack == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int value) {
		//if array is full, show stack overflow error
		if(isFullStack()) {
			System.out.println("Stack overflow error!!");
		}else {
			array[topOfStack+1] = value;
			topOfStack++;
			System.out.println("Successfully inserted " + value + " in the stack");
		}
	}
	
	public void pop() {
		//if array is empty, show stack underflow error
		if(isEmptyStack()) {
			System.out.println("Stack underflow error!!");
		}else {
			System.out.println("Poping value from Stack: " + array[topOfStack] + "...");
			topOfStack--;
		}
	}
	
	public void peekOperation() {
		//if array is empty, show stack underflow error
		if(!isEmptyStack()) {
			System.out.println("Top of Stack: "+array[topOfStack]);
		}else {
			System.out.println("The stack is empty!!");
			topOfStack--;
		}
		System.out.println();
	}
	
	public  void deleteStack() {
		array = null;
		System.out.println("Stack is successfully deleted");
	}

}
