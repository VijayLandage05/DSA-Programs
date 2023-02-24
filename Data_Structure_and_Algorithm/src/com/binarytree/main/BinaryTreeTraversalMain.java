package com.binarytree.main;

import com.binarytree.tree.BinaryTreeTraversal;
import com.binarytree.tree.*;
public class BinaryTreeTraversalMain {
	
	public static void main(String[] args) {
		
		BinaryTreeTraversal bt = new BinaryTreeTraversal();
	 
		bt.root = new Node(6);
		bt.root.left = new Node(4);
		bt.root.right = new Node(8);
		bt.root.left.left = new Node(3);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(7);
		bt.root.right.right = new Node(9);
		
		System.out.print("Preorder Traversal is : ");
		bt.printPreorder(bt.root);
		System.out.println();
		System.out.print("Inorder Traversal is : ");
		bt.printInorder(bt.root);
		System.out.println();
		System.out.print("Postorder Traversal is : ");
		bt.printPostorder(bt.root);
	}
}
