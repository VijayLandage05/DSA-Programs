package com.doublylinkedlist.entity;

public class DoublyLinkedList {
    
	private Node head;
	
	public static class Node 
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data) {
			this.data = data;
		}		
	} 
//*********************
	
	public void AddNewNodeAtEnd(int value) //    Insertion 
	{
		Node newNode=new Node(value);
		
		if(head==null)  // Condition 1-->if list is Empty or not
		{ 
			head=newNode;
			System.out.println("Node added in Empty List...");
			return;
		}

		Node temp=head;        // New Node added at the end..
		while(temp.next!=null) 
		{
			temp=temp.next;
		}
		temp.next=newNode;   
		newNode.prev=temp;
		System.out.println("New Node added at the end of the List..");
	}

//************************	
	public void addNodeAtGivenPostion(int value,int position) // Added Node By Position 
	{
		Node newNode=new Node(value);
		int count=0;
		
		if(count==position) {
			System.out.println("Node can not be inserted in the given position..");
			return;
		}
		count++;
		
		if(head!=null&& count==position) 
		{
		    newNode.next=head;;
		    head.prev=newNode;			
			newNode.prev=null;
		    head=newNode;		
			head.prev=null;
			System.out.println("Node with "+head.data+" value at First position...");
			return ;
		}
		count++;
		Node temp=head;
        while(temp!=null && count<position) {
        	temp=temp.next;
        	count++;
        }
        
        if(temp!=null)
        {  
        	newNode.next=temp.next;
        	newNode.prev=temp.next.prev;			
			
        	temp.next.prev=newNode;
        	temp.next=newNode;
        	temp=newNode;
			
			System.out.println("Node with "+temp.data+" value added at "+position+ "th Position in the list");
			return;
        }
        
       
	}	

       
//***************************
	
	public void traverseList() // Display all value in Ascending Order 
	{
		if(head==null)  // Condition 1--> if list is Empty or not
		{ 
			System.out.println("No Node present in the List...");
			return;
		}
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}		
	}
//**************************
	
	public void traverseListReverseOrder() // Display all value in Descending Order
	{
		if(head==null)  // Condition 1--> if list is Empty or not
		{ 
			System.out.println("Node added in Empty List...");
			return;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
//****************************
	
	public void deleteNodeByGivenValue(int value) // Delete node by Value
	{
		if(head==null)  // Condition 1--> if list is Empty or not
		{ 
			System.out.println("Can not Delete From Empty List..");
			return;
	    }
		
	// Condition 2--> if value is found at first node,which only one node in list	
		if(head.data==value && head.next==null)
		{
		  head=null;
		  System.out.println("Removed the Only Element, which is present in The List..");
		  return;
		}
    
   // Condition 3--> if value is found at first node 	
		
		if(head.data==value)
		{
			head.next.prev=null;
			head=head.next;
			System.out.println("Node With Given value deleted Right from the start of list...");
			return;
		}

// conditions For--> If value is not found at First node...
		
    	Node temp=head;
		while(temp!=null && temp.data!=value) {
			temp=temp.next;
		}

// Condition 4--> if value found at Middle Node of list	
		if(temp!=null&&temp.next!=null) 
		{
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			System.out.println("Node With Given Value has been deleted...");
			return;
		}
		
// Condition 5--> if value found at Last Node	
		
		if(temp!=null &&temp.next==null)
		{
		 temp.prev.next=null;
		 temp.prev=null;
		 System.out.println("Node With Given value has been deleted right from the end...");
		 return;
		}
 
   // Condition 6--> if value is not found in the list..	
		if(temp==null) 
		{
		   System.out.println("Node with Given Value is Not Found..");
		   return;
		}			
	}	
	
	
	
}