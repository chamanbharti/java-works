package ds.linear.linkedlist;

import java.util.NoSuchElementException;
///https://javarevisited.blogspot.com/2017/07/top-10-linked-list-coding-questions-and.html#axzz6kRIdb5FV
public class LinkedList {

	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	Node tail;
	int size = 0;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
		System.out.println(this);
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			//head = tail = node;
		}else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			//head = tail = node;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	@SuppressWarnings("unused")
	public void add(int data,int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("Index out of range");
			return;
		}
		Node current = head;
		Node previous = null;
		int i = 0;
		while(current != null || i != index) {
			previous = current;
			current = current.next;
			i++;
		}
		Node newNode = new Node(data);
		if(previous == null) {
			newNode.next = head;
			head = newNode;
		}else {
			previous.next = newNode;
			newNode.next = current;
		}
		size++;
		System.out.println(this);
	}
	
	public  void removeFirst() {
		// [ 10 -> 20 -> 30]
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(head == tail) {
			head = tail = null;
			return;
		}
		Node newNode = head.next;
		head.next = null;
		head = newNode;
		
	}
	public void removeLast() {
		//[10 -> 20-> 30 ]
		// previous -> 20
		//last -> 20
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(head == tail) {
			head = tail = null;
			return;
		}
		Node previous = getPrevious(tail);
		tail = previous;
		tail.next = null;
		
	}
	private Node getPrevious(Node newNode) {
		Node current = head;
		while(current != null) {
			if(current.next == newNode)
				return current;
			current = current.next;
		}
		return null;
	}
	
	public Node removeMiddle(Node newNode) {
		if(newNode == null || newNode.next == null) {
			return null;
		}
		Node slow,fast,prev;
		slow = fast = prev = newNode;
		while(fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		return newNode;
	}
	public void remove(int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("index out of range");
			return;
		}
		Node current = head;
		Node previous = null;
		int i = 0;
		while(current != null && i != index) {
			previous = current;
			current = current.next;
			i++;
		}
		if(previous == null) {
			head = current.next;
		}else {
			previous.next = current.next;
		}
		if(current == tail) {
			tail = previous;
		}
		current.next = null;
		size--;
		System.out.println(this);
	}
	
	public void removeObject(int data) {
		Node current = head;
		Node previous = null;
		while(current != null && current.data != data) {
			previous = current;
			current = current.next;
		}
		if(current == null) {
			System.out.println("Target data not found");
			return;
		}
		if(previous == null) {
			head = current.next;
		}else {
			previous.next = current.next;
		}
		if(current == tail) {
			tail = previous;
		}
		current.next = null;
		size--;
		System.out.println(this);
	}
	
	public int get(int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("index out of range");
			return Integer.MIN_VALUE;
		}
//		Node current = head;
//		int i = 0;
//		while(current != null && i != index) {
//			current = current.next;
//			i++;
//		}
		Node current = find(index);
		return current.data;
	}
	
	public Node find(int index) {
		Node current = head;
		int i = 0;
		while(current != null && i != index) {
			current = current.next;
			i++;
		}
		return current;
	}
	
	public void set(int data,int index) {
		if(index < 0 || index > (size-1)) {
			System.out.println("index out of range");
		}
		Node target = find(index);
		target.data = data;
		System.out.println(this);
	}
	public int indexOf(int data) {
		Node current = head;
		int i = 0;
		int index = -1;
		while(current != null) {
			if(current.data == data) {
				index = i;
				break;
			}
			current = current.next;
			i++;
		}
		return index;
	}
	public int indexOf2(int data) {
		int index = 0;
		Node current = head;
		while(current != null) {
			if(current.data == data) {
				return index;	
			}
			current = current.next;
			index++;
			
		}
		return -1;
	}
	public int lastIndexOf(int data) {
		Node current = head;
		int i = 0;
		int index = -1;
		while(current != null) {
			if(current.data == data) {
				index = i;
			}
			current = current.next;
			i++;
		}
		return index;
	}
	
	public boolean containsOf(int data) {
		return indexOf(data) != -1;
	}
	
	public boolean containsOf2(int data) {
		return indexOf2(data) != -1;
	}
	
	public int size() {
		return size;
	}

//	public boolean isEmpty() {
//		return size == 0;
//	}
	public boolean isEmpty() {
		return head == null;
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}
	
	public int countNodes(Node head) {
		int count = 0;
		Node current = head;
		if(current !=null) {
			while(current.next != null) {
				current = current.next;
				count++;
			}
		}
		
		return count;
	}
	public int lengthByIterative(){ 
		int count=0; 
		Node current = this.head; 
		while(current != null){ 
			count++; 
			current=current.next;
		} 
		return count; 
	}
	public int lengthByRecursive(Node current) {
		//Node current = this.head;
		if(current == null) {
			return 0;
		}
		return 1+lengthByRecursive(current.next);
	}

	public void printLinkedList() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println();
	}
	public void reverseNodeUsingIterativeApproach() {
		Node previous = null;
		Node current = head;
		Node next;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}
	
	public Node reverseNodeUsingRecursivelyApproach(Node head) {
		//Time Complexity – O(n)
		//Space Complexity – O(1)
		Node first;
		if(head == null || head.next == null) {
			return head;
		}
		first = reverseNodeUsingRecursivelyApproach(head.next);
		head.next.next = head;
		head.next = null;
		
		return first;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node current = head;
		while(current != null) {
			sb.append(current.data).append(",");
			current = current.next;
		}
		if(sb.length() > 1) {
			sb.deleteCharAt(sb.length() -1);
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
//		ll.add(40, 2);
		//ll.remove(3);
		//ll.removeObject(10);
//		System.out.println(ll.get(10));
//		System.out.println(ll);
//		System.out.println(ll.find(2));
		//ll.set(30, 0);
		
		//ll.clear();
//		ll.addLast(10);
//		ll.addLast(20);
//		ll.addLast(30);
//		ll.addLast(40);
//		ll.addLast(50);
//		System.out.println("index of "+ll.indexOf2(40));
//		ll.removeFirst();
		//System.out.println("index of "+ll.containsOf2(10));
		//ll.removeMiddle(ll.head);
		System.out.println("total nodes:"+ll.countNodes(ll.head));
//		ll.reverseNodeUsingIterativeApproach();
		//ll.reverseNodeUsingRecursivelyApproach(ll.head);
		//ll.printLinkedList();
		//System.out.println(ll.lengthByIterative());
		System.out.println(ll.lengthByRecursive(ll.head));
		System.out.println(ll);
	}
}
