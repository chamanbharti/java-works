package books.linkedlist;

public class Node {

	private int data;
	private Node nextNode;
	
	// Constructor to create a new node 
    // Next is by default initialized  as null 
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString() {
		return "Data: "+this.data;
	}
}
