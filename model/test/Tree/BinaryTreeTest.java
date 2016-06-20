package Tree;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testTree() {
		BinaryTree bTree = BinaryTree.build();
		System.out.println("先序遍历：");
		// bTree.preOrder(bTree.getRoot());
		// bTree.preOrder2(bTree.getRoot());

		System.out.println("\n中序遍历：");
		// bTree.midOrder(bTree.getRoot());
		// bTree.minOrder2(bTree.getRoot());

		System.out.println("\n后序遍历：");
		bTree.postOrder(bTree.getRoot());
		System.out.println();
		bTree.postOrder2(bTree.getRoot());
	}

	@Test
	public void testLevelOrder() {
		BinaryTree bTree = BinaryTree.build();
		bTree.levelOrder(bTree.getRoot());
	}

	@Test
	public void testDeep() {
		BinaryTree bTree = BinaryTree.build();
		int deep = bTree.deepTree(bTree.getRoot());
		System.out.println("树的高度："+deep);
	}
}
