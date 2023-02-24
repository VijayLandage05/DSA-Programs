package com.linkedlist.main;

import com.linkdedlist.entity.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList lst=new LinkedList();
		lst.addNewNode(70);
		lst.addNewNode(60);
		lst.addNewNode(80);
		lst.addNewNode(90);
		lst.addNewNode(75);
		
		System.out.println("");
		
		lst.displayList();;
		
//		System.out.println(" ");
//		lst.deleteNodeByValue(60);
//		lst.displayList();
//		System.out.println("");
//		lst.deleteNodeByValue(90);
//		lst.displayList();
//		System.out.println(" ");
		lst.deleteNodeByPosition(6);
		lst.displayList();
	}
}