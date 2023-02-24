package com.circularqueue.main;

import com.circularqueue.entity.CircularQueue;

public class CircularQueueMain {

	public static void main(String[] args) {
		
		CircularQueue obj = new CircularQueue();
		
		obj.enqueue(10);
		obj.enqueue(25);
		obj.enqueue(38);
		obj.enqueue(45);
		obj.enqueue(60);
		obj.enqueue(70);
		
		int Delelem = obj.dequeue();
		
		if(Delelem != -1) {
			System.out.println("Deleted element is "+Delelem);
		}
		int Delem2=obj.dequeue();
		
		if (Delem2==-1) {
		System.out.println("Queue is Empty...");
		}
		else {
		System.out.println("Deleted Element is :"+Delem2);}
		
		obj.enqueue(90);
	}
}
