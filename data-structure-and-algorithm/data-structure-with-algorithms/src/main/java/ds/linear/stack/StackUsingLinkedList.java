package ds.linear.stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList {

	private Node top;
	private int size;
	
	private class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
//			System.out.println("Stack is empty");
//			return;
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
//			return -1;//you can add any logic here
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void displayStack() {
		Node current = top;
		while(current != null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
	}
}
