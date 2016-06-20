package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

	private Node root;

	private class Node {
		private int data;
		private Node right;
		private Node left;

		public Node(int data) {
			this.right = null;
			this.left = null;
			this.data = data;
		}

	}

	public BinaryTree() {
		setRoot(null);
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	// build BinaryTree
	public void buildTree(Node node, int data) {
		if (getRoot() == null)
			setRoot(new Node(data));
		else {
			if (node.data > data) {
				if (node.left == null) {
					node.left = new Node(data);
				} else {
					buildTree(node.left, data);
				}

			} else {
				if (node.right == null) {
					node.right = new Node(data);
				} else {
					buildTree(node.right, data);
				}
			}
		}
	}

	// init tree
	public static BinaryTree build() {
		int[] data = { 12, 76, 35, 22, 16, 48, 90, 46, 9, 40 };
		BinaryTree bTree = new BinaryTree();
		for (int i = 0; i < data.length; i++) {
			bTree.buildTree(bTree.getRoot(), data[i]);
		}
		return bTree;

	}

	// 先序遍历
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + ", ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	// 中序遍历
	public void midOrder(Node node) {
		if (node != null) {
			midOrder(node.left);
			System.out.print(node.data + ", ");
			midOrder(node.right);
		}
	}

	// 后序遍历
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + ", ");
		}
	}

	// 先序非递归遍历
	public void preOrder2(Node node) {
		Stack<Node> stack = new Stack<Node>();
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				System.out.print(node.data + ", ");
				stack.push(node);
				node = node.left;
			}
			if (!stack.isEmpty()) {
				node = stack.pop();
				node = node.right;
			}
		}
	}

	// 中序非递归遍历
	public void minOrder2(Node node) {
		Stack<Node> stack = new Stack<Node>();
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			if (!stack.isEmpty()) {
				node = stack.pop();
				System.out.print(node.data + ", ");
				node = node.right;
			}
		}
	}

	// 后序非递归遍历
	public void postOrder2(Node node) {
		Stack<Node> stack = new Stack<Node>();
		Node preNode = null;// 最近一次访问的节点
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.peek();
			if (node.right == null || node.right == preNode) {
				System.out.print(node.data + ", ");
				node = stack.pop();
				preNode = node;
				node = null;
			} else {
				node = node.right;
			}
		}
	}

	// 层次遍历
	public void levelOrder(Node node) {
		if (node == null)
			return;
		List<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (!queue.isEmpty()) {
			Node head = queue.get(0);
			System.out.print(head.data + ", ");
			queue.remove(0);
			if (head.left != null)
				queue.add(head.left);
			if (head.right != null)
				queue.add(head.right);
		}
		System.out.println();
	}

	// deep
	public int deepTree(Node node) {
		int deep = 0;
		if (node != null) {
			int leftDeep = deepTree(node.left);
			int rightDeep = deepTree(node.right);
			deep = leftDeep>=rightDeep?leftDeep+1:rightDeep+1;
		}
		return deep;
	}
}
