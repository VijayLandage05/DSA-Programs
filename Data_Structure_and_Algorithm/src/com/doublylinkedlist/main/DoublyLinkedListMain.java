package com.doublylinkedlist.main;

import com.doublylinkedlist.entity.DoublyLinkedList;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
       
		DoublyLinkedList db1=new DoublyLinkedList();
		db1.AddNewNodeAtEnd(2);
		db1.AddNewNodeAtEnd(4);
		db1.AddNewNodeAtEnd(6);
		db1.AddNewNodeAtEnd(8);
		db1.AddNewNodeAtEnd(10);
		System.out.println();
		db1.traverseList();
		
		System.out.println();
		db1.traverseList();
		System.out.println("");
		
		
		 db1.traverseList();
 		System.out.println("");
         db1.traverseListReverseOrder();		
  		System.out.println("");
         db1.addNodeAtGivenPostion(5,2);
  		System.out.println("");
        db1.traverseList();
  		System.out.println("");        
        db1.deleteNodeByGivenValue(2);
        db1.traverseList();
 		
        
	}

}