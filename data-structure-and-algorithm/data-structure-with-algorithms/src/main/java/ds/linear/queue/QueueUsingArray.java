package ds.linear.queue;

class Queue {
	
	int capacity = 5;
	int arr[] = null;
	int front = 0;
	int rear = -1;
	
	public Queue() {
		this.arr = new int[capacity];
	}
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	
	public void enqueue(int data) {
//		if(rear + 1 == capacity) {
		if(isFull()) {
			System.err.println("Queue is full can't insert");
			return;
		}
//		rear = rear + 1;
//		arr[rear] = data;
		arr[++rear] = data;
		System.out.println(data+" enqueue into Queue");
	}
	
	public void dequeue() {
		//get the front element from array
		//shift down the remaining data
		//reduce rear--
		if(front == size()) {
			System.out.println("Queue is Empty");
			return;
		}
		int data = arr[front];
		for(int i = front;i<rear;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		System.out.println(data+" dequeue from Queue");
	}
	
	public int rear() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		return arr[rear];
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		return arr[front];
	}
	
	public boolean isFull() {
		return size() == capacity;
	}
	
	public boolean isEmpty() {
		return size() == front;
	}
	public int size() {
		return rear + 1;
	}
}
public class QueueUsingArray {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		System.out.println("After inserting data's");
		System.out.println("Rear Item is :"+q.rear());
		System.out.println("Front Item is :"+q.front());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
			
}
