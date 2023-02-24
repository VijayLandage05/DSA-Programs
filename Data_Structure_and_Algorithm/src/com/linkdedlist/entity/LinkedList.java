package com.linkdedlist.entity;

public class LinkedList {
		
	private Node head;
		
	public class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	public void addNewNode(int value) {
		Node n = new Node(value);
		if (head == null) {
			head = n;
			System.out.println("New Node Added");
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp=temp.next;
		}
		temp.next=n;
		System.out.println("New node added at the end of list"+value);
	}
	public void traverseList() {
		if(head==null) {
			System.out.println("the list is empty");
			return;
		}
		if(head.next == null) {
			System.out.println(head.data);
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void deleteNodeByValue(int value) // Deletion ByValue
	{
		Node temp=null;
		Node prev=null;
		if(head==null) // check Linkedlist is empty or not
			{
			System.out.println("The LinkedList is empty,cannotshowits nodes..");
		return;
	}
		if(head.data==value) // If Value found at Head of the node(at the 1st node)
	{
			head=head.next;
			return;
	}
	// If Value found at the middle or last node
		temp=head;
		while(temp.next!=null && temp.data!=value)
	{	
			prev =temp;
			temp=temp.next;
	}
		if(temp!=null)
	{
			prev.next=temp.next;
			temp=null;
			System.out.println("Node deleted from the list...");return;
	}
		if(temp==null) {
			System.out.println("No such value was found..");
			return;
	}
	}
		public void deleteNodeByPosition(int position)// DeleteAtPosition
		{
		Node temp=null;
		Node prev=null;
		int count=0;
		if(count==position) // check Linkedlist is empty or not
			{
			System.out.println("The LinkedList is empty,cannotshowits nodes..");
		return;
	}
		count++;
		if(count==position) // If Value found at Head of the node(at the 1st node)
	{
		head=head.next;
		return;
	}
		temp=head;
		while(temp.next!=null&&count!=position )
	{
			prev =temp;
			temp=temp.next;
			count++;
	}
		if(position>count ) {
			System.out.println("No such Position available..");return;
	}
		if(temp!=null)
	{
			prev.next=temp.next;
			temp=null;
			System.out.println("Node deleted from the list...");return;
	}
		if(temp==null ) {
			System.out.println("No such Position available..");return;
	}
	}
		public void displayList() // Display all node from theList
		{
		if(head==null) // check Linkedlist is empty or not
		{
		System.out.println("The LinkedList is empty,cannotshowits nodes..");
		return;
		}
		if(head.next==null) // check next node is availableornot
			{
		System.out.println(head.data);
		return;
		}
 
			Node temp = head;
			while(temp!=null) // Printing All node data
		{
				System.out.print(temp.data+" ");
				temp=temp.next;
		}
		}
 }

