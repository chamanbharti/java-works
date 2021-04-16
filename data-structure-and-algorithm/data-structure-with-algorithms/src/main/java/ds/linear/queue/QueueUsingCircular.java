package ds.linear.queue;

class CircularQueue {
	
	int arr[] = null;
	int capacity = 3;
	int front = 0;
	int rear = -1;
	int size = 0;
	
	public CircularQueue() {
		this.arr = new int[capacity];
	}
	
	public CircularQueue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	public void enqueue(int data) {
//		if(size == capacity) {
		if(isFull()) {
			System.err.println("Queue is full can't insert");
			return;
		}
//		rear = rear + 1;
		rear = (rear + 1) % capacity;
		arr[rear] = data;
		if(rear == capacity) {
			rear = 0;
		}
		
		size++;
		System.out.println(data+" enqueue into Queue");
		System.out.println("After enqueue into Queue "+rear);
	}
	
	public void dequeue() {
		//get the front element from array
		//shift down the remaining data
		//reduce rear--
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		int data = arr[front];
//		front = front + 1;
		front = (front + 1) % capacity;
		size--;
		System.out.println(data+" dequeue from Queue");
		System.out.println("After dequeue front is "+front);
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		return arr[front];
	}
	
	public int rear() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		return arr[rear];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}

public class QueueUsingCircular {

	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.dequeue();
		System.out.println("Size of Queue is "+q.size());
		System.out.println("Front item is "+q.front());
		System.out.println("Rear item is "+q.rear());
		System.out.println("Is Queue if full "+q.isFull());
		System.out.println("Is queue Empty "+q.isEmpty());
	}
}
