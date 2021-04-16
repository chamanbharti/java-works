package ds.nonlinear.trees.min_max;
// https://java2blog.com/find-minimum-and-maximum-elements-binary-search-tree-java/
// https://www.netjstech.com/2019/03/find-minimum-and-maximum-nodes-in-bst-java.html
public class FindMinMaxValue {
	
	private Node root;
	class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data = data;
		}
	}
	
	int findMinValue() {
		Node temp = root;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp.data;
	}
	
	Node findMinValue(Node root) {
		if(root.left == null) {
			return root;
		}else {
			return findMinValue(root.left);
		}
	}
	
	int findMaxValue() {
		Node temp = root;
		while(temp.right != null) {
			temp = temp.right;
		}
		return temp.data;
	}
	
	Node findMaxValue(Node root) {
		if(root.right == null) {
			return root;
		}else {
			return findMaxValue(root.right);
		}
	}
	
	void insert(int data) {
		if(root == null) {
			root = new Node(data);
		}
		insertNode(root, data);
	}
	
	private Node insertNode(Node node,int data) {
		Node tempNode = null;
		if(data <= node.data) {
			if(node.left == null) {
				node.left = new Node(data);
				return node.left;
			}else {
				tempNode = node.left;
			}
		}else {
			if(node.right == null) {
				node.right = new Node(data);
				return node.right;
			}else {
				tempNode = node.right;
			}
		}
		return insertNode(tempNode, data);
	}
	
	public static void main(String[] args) {
		FindMinMaxValue bst = new FindMinMaxValue();
		bst.insert(45);
		bst.insert(89);
		bst.insert(234);
		bst.insert(60);
		bst.insert(12);
		bst.insert(1);
		System.out.println("Min Value: "+bst.findMinValue());
		System.out.println("Min Value: "+bst.findMaxValue());
		
		System.out.println("Min Value: "+bst.findMinValue(bst.root).data);
		System.out.println("Min Value: "+bst.findMaxValue(bst.root).data);
	}

}
