package ds.linear.queue;

import ds.linear.stack.Stack;

class QueueStack{
	
	private Stack enqueueStack = null;
	private Stack dequeueStack = null;
	int capacity = 5;
	
	public QueueStack(){
		this.enqueueStack = new Stack(capacity);
		this.dequeueStack = new Stack(capacity);
	}
	
	public QueueStack(int capacity){
		this.capacity = capacity;
		this.enqueueStack = new Stack(capacity);
		this.dequeueStack = new Stack(capacity);
	}
	
	public void enqueue(int data) {
		if(enqueueStack.isFull()) {
			System.out.println("Queue is full can't inset");
			return;
		}
		enqueueStack.push(data);
		System.out.println(data+" enqueued into Queue");
	}
	public void dequeue() {
		if(enqueueStack.isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		while(!enqueueStack.isEmpty()) {
			dequeueStack.push(enqueueStack.peek());
			enqueueStack.pop();
		}
		int data = dequeueStack.peek();
		dequeueStack.pop();
		
		while(!dequeueStack.isEmpty()) {
			enqueueStack.push(dequeueStack.peek());
			dequeueStack.pop();
		}
		
		System.out.println(data+" dequeue from Queue");
		//System.out.println("After dequeue front is "+front);
	}
	
	public int front() {
		if(enqueueStack.isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MAX_VALUE;
		}
		while(!enqueueStack.isEmpty()) {
			dequeueStack.push(enqueueStack.peek());
			enqueueStack.pop();
		}
		int data = dequeueStack.peek();
		
		while(!dequeueStack.isEmpty()) {
			enqueueStack.push(dequeueStack.peek());
			dequeueStack.pop();
		}
		return data;
	}
	
	public int rear() {
		if(enqueueStack.isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		return enqueueStack.peek();
	}
	
	public boolean isFull() {
		return enqueueStack.isFull();
	}
	
	public boolean isEmpty() {
		return enqueueStack.isEmpty();
	}
	
	public int size() {
		return enqueueStack.size();
	}
}
public class QueueUsingStack {
	
	public static void main(String[] args) {
		
		QueueStack qs = new QueueStack();
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		qs.enqueue(40);
		qs.enqueue(50);
		System.out.println( "Front Item is "+qs.front());
		System.out.println( "Rear Item is "+qs.rear());
		System.out.println( "size of queue is "+qs.size());
		System.out.println( "Is queue full "+qs.isFull());
		System.out.println( "Is queue empty "+qs.isEmpty());
	}

}
