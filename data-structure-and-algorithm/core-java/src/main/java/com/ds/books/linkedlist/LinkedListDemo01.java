package ds.books.linkedlist;
public class LinkedListDemo01 {

	private static class Node{
		private int value;
		private Node next;
		public Node(int v,Node n) {
			this.value = v;
			this.next = n;
		}
		public Node(int v) {
			this.value = v;
			this.next = null;
		}
	}
	private Node head;
	private int size = 0;
	//other methods
	
	//Size of List
	public int size() {
		return size;
	}
	
	//IsEmpty function
	public boolean isEmpty() {
		return size == 0;
	}
	//Insert element at the Head
	public void addHead(int value) {
		head = new Node(value,head);
		size++;
	}
	
	//Insertion of an element at the end
	public void addTail(int value) {
		Node newNode = new Node(value);
		Node curr = head;
		if(head == null) {
			head = newNode;
		}
		while(curr != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	//Traversing Linked List
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value+"");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		
		LinkedListDemo01 ll = new LinkedListDemo01();
		ll.addHead(1);
		ll.addHead(2);
		//ll.addTail(40);
		ll.addHead(3);
		ll.addHead(1);
		ll.addHead(2);
		ll.addHead(30);
		
		ll.print();
		System.out.println("isEmpty:"+ll.isEmpty());
		System.out.println("size:"+ll.size());
	}
}
