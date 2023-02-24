package com.circularqueue.entity;

public class CircularQueue {
	
		private int Size = 5;
		int front, rear;
		int items[] = new int[Size];
		
		public CircularQueue() {
			front = -1;
			rear = -1;
		}
		
		boolean isFull() {
			if(front == 0 && rear == Size-1) {
				return true;
			}
			if(front == rear+1) {
				return true;
			}
			return false;
		}
		
		boolean isEmpty() {
			if(front == -1) {
				return true;
			}
			return false;
		}
		
		public void enqueue(int element) {
			if(isFull()) {
				System.out.println("Queue is full, cannot insert new element");
			}else {
				if(front == -1)
				front = 0;
				rear = (rear + 1)% Size;
				items[rear] = element;
				System.out.println("Inserted "+element);
			}
		}
		public int dequeue() {
			int element;
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return (-1);
			}else {
				element=items[front];
				if(front == rear) {
					front = -1;
					rear = -1;
				}else {
					front = (front + 1) % Size;
				}
			}return (element);
		}
}
