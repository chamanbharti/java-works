package ds.linear.stack;

import java.util.EmptyStackException;

public class Stack {

	int arr[] = null;
	int capacity = 5;
	int top = -1;
	
	public Stack() {
		this.arr = new int[capacity];
	}
	public Stack(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	public void push(int data) {
//		top = top+1;
//		arr[top] = data;
//		if(top+1 == capacity) {
		if(isFull()) {
//			System.out.println("Stack is full, Can't be pushed");
//			return;
			throw new RuntimeException("Stack is full!!");
		}
		arr[++top] = data;
		System.out.println(data+" inserted into Stack");
	}
	
	public void pop() {
//		if(top == -1) {
		if(isEmpty()) {
//			System.out.println("Stack is empty");
//			return;
			throw new EmptyStackException();
		}
//		int data = arr[top];
//		top = top - 1;
		int data = arr[top--];
		System.out.println(data+" removed from stack");
	}
	
	public int peek() {
		if(isEmpty()) {
//			return -1;//you can add any logic here
			throw new EmptyStackException();
		}
		return arr[top];
	}
	public boolean isFull() {
//		return (top+1) ==  capacity;
		return size() ==  capacity;
	}
	public  boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top+1;
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(25);
		s.push(40);
		s.push(50);
		System.out.println("Before Removing Elements");
		System.out.println("Is Stack is full - "+s.isFull());
		System.out.println("Is Stack is empty - "+s.isEmpty());
		System.out.println(s.peek()+" peek from Stack");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("Is Stack is full - "+s.isFull());
		System.out.println("Is Stack is empty - "+s.isEmpty());
	}
}
