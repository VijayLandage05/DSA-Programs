package com.arrayinsertion.entity;

public class ArrayInsertionEntity {
	private int size;
	private int[] elements;
	
	public ArrayInsertionEntity(int[] elements) {
		
		this.elements = elements;
	}
	
	public void traverseArray()
	{
		System.out.println("All elements of array are:- ");
		
		for(int i=0;i<elements.length;i++){
			 System.out.print(elements[i]+" ");
			 
		}
		System.out.println(" ");
	}
	
	public void insertArray(int num,int position) {
		
		 int temp=0;
		for(int i=elements.length-1;(position-1)<i;i--) {
			
			 temp=elements[i];
			  elements[i]=elements[i-1];
			       
		}
		
		elements[position-1]=num;
	    
		System.out.println("All elements of array are after insertion:- ");
		for(int i=0;i<elements.length;i++){
			 System.out.print(elements[i]+" ");	 
		}
	}
}