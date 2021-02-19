package ds.linear.queue;

import ds.linear.linkedlist.DoublyLinkedList;

public class QueueUsingDLL {

	private DoublyLinkedList list = null;
	
	QueueUsingDLL(){
		this.list = new DoublyLinkedList();
	}
	
	public void enqueue(int data) {
		list.add(data);
		System.out.println(data+" Enqueue into Queue");
	}
	
	public void dequeue() {
		if(isEmpty() && list != null) {
			System.out.println("Queue is  Empty");
			return;
		}
		int data = front();
		list.remove(0);
		System.out.println(data+" Dequeue from Queue");
	}
	
	public int front() {
		return list.get(0);
	}
	public int rear() {
		return list.get(size() - 1);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
	
	public static void main(String[] args) {
		QueueUsingDLL q = new QueueUsingDLL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		System.out.println("Rear Item is :"+q.front());
		System.out.println("Front Item is :"+q.rear());
		q.dequeue();
		q.dequeue();
		System.out.println("Size of The queue is :"+q.size());
		System.out.println("Is Queue empty :"+q.isEmpty());
		
	}
}
