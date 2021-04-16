package ds.nonlinear.trees.books.hemantjain;

public class Tree {

	private static class Node {
		private int value;
		private Node lChild;
		private Node rChild;

		public Node(int v, Node l, Node r) {
			value = v;
			lChild = l;
			rChild = r;
		}

		public Node(int v) {
			value = v;
			lChild = null;
			rChild = null;
		}
	}

	private Node root;

	public Tree() {
		root = null;
	}

	public void levelOrderBinaryTree(int[] a) {
		root = levelOrderBinaryTree(a, 0);
	}

	private Node levelOrderBinaryTree(int[] a, int start) {
		int size = a.length;
		Node current = new Node(a[start]);
		int left = 2 * start + 1;
		int right = 2 * start + 2;

		if (left < size) {
			current.lChild = levelOrderBinaryTree(a, left);
		}
		if (right < size) {
			current.lChild = levelOrderBinaryTree(a, right);
		}
		return current;
	}
	
	public void printPreOrder() {
		System.out.println("\n**Pre Order Traversal**");
		printPreOrder(root);
	}
	private void printPreOrder(Node node) {
		if(node != null) {
			System.out.print(" "+node.value);
			printPreOrder(node.lChild);
			printPreOrder(node.rChild);
		}
	}
	
	public void printPostOrder() {
		System.out.println("\n**Post Order Traversal**");
		printPostOrder(root);
	}
	private void printPostOrder(Node node) {
		if(node != null) {
			printPreOrder(node.lChild);
			printPreOrder(node.rChild);
			System.out.print(" "+node.value);
		}
	}
	
	public void printInOrder() {
		System.out.println("\n**In Order Traversal**");
		printInOrder(root);
	}
	private void printInOrder(Node node) {
		if(node != null) {
			printPreOrder(node.lChild);
			System.out.print(" "+node.value);
			printPreOrder(node.rChild);
		}
	}

	public static void main(String[] args) {

		Tree tree = new Tree();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		tree.levelOrderBinaryTree(a);
		tree.printPreOrder();
		tree.printPostOrder();
		tree.printInOrder();
	}
}
