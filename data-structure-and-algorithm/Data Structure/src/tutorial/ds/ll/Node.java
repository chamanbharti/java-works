package tutorial.ds.ll;

public class Node {
	
	static int data;
	static Node nextNode;
	// Constructor to create a new node 
    // Next is by default initialized  as null 
	Node(int data){
		this.data=data;
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

	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}
	
	

}
